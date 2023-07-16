package com.yejin.board.entity;


import com.yejin.board.DTO.LogInDto;
import com.yejin.board.DTO.LogOutDto;
import com.yejin.board.DTO.SignUpDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder // 빌드 사용
@AllArgsConstructor
@NoArgsConstructor   // Getter, Setter 생성자
@Entity(name="User") // 해당 클래스를 Entity 클래스로 사용하겠다
@Table(name="User") // Table(name= "테이블 명") 데이터베이스에 해당하는 클래스와 현재 클래스를 매핑 시키겠다.
public class UserEntity {
    @Id //  userId를 primary key 로 사용하겠다.
    @Column(length = 50)
    private String userId ;
    @Column( length = 30)
    private String userEmail;
    @Column(length = 30)
    private String userPwd;
    @Column(length = 10)
    private int loginStatus=0;
    // 생성자
    public UserEntity(SignUpDto dto){
        this.userEmail = dto.getUserEmail();
        this.userPwd = dto.getUserPw();
        this.userId = dto.getUserId() ;
    }
    public UserEntity(LogInDto dto){
        this.userPwd = dto.getUserPw();
        this.userEmail = dto.getUserEmail();
        this.userId = dto.getUserId();
    }
    public UserEntity(LogOutDto dto){
        this.userPwd = dto.getUserId();
        this.userEmail = dto.getUserEmail();
        this.userId = dto.getUserPw();
    }
}

