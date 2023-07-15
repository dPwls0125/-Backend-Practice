package com.yejin.board.service;

import com.yejin.board.DTO.LogInDto;
import com.yejin.board.DTO.ResponseDto;
import com.yejin.board.DTO.SignUpDto;
import com.yejin.board.entity.UserEntity;
import com.yejin.board.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class AuthService {

    @Autowired
    UserRepository userRepository;
    public ResponseDto signUp(SignUpDto dto) {

        String userEmail = dto.getUserEmail();
        String userPassword = dto.getUserPw();
        String userPasswordCheck = dto.getCheckUserPw();

        // email 중복 확인
        try{
            if(userRepository.existsById(userEmail))
                return ResponseDto.setFailed("Existed Email!");
        }catch(Exception e)
        {
            return ResponseDto.setFailed("Data Base Error");
        }

        // 비밀번호가 서로 다르면 failed response 반환!
        if (!userPassword.equals(userPasswordCheck))
            return ResponseDto.setFailed("password does not matched");

        // 이메일 유효성 확인
        String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

        boolean isValidEmail =  EMAIL_PATTERN.matcher(userEmail).matches();
        if(!isValidEmail){
            return ResponseDto.setFailed("유효하지 않은 이메일 형식입니다.");
        }

        // UserEntity 생성
        UserEntity userEntity = new UserEntity(dto);

        try{
            //UserRepository를 이용해서 데이터 베이스에 Entity 저장.
            userRepository.save(userEntity);
        }catch(Exception e){
            return ResponseDto.setFailed("Data Base Error!");
        }

        // 성공시 success response 반환
        return ResponseDto.setSuccess("Sign Up Success", null);
    }
    public ResponseDto logIn(LogInDto dto)
    {
        String userPassword = dto.getUserPw();
        String userId = dto.getUserId();

        boolean existed = userRepository.existsByIdAndPassword(userId, userPassword);
        if(!existed) return ResponseDto.setFailed("존재하지 않는 계정입니다.");

        UserEntity user;
        try{
            user = userRepository.findByUserId(userId);
        }catch(Exception e){
            return ResponseDto.setFailed("Data Base Error!");
        }
        user.setLoginStatus(1);
        userRepository.save(user);
        return ResponseDto.setSuccess("로그인 성공", null);
    }

}