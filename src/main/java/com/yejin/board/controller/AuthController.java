package com.yejin.board.controller;

import com.yejin.board.DTO.*;
import com.yejin.board.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    AuthService authService ;

    @PostMapping("/signUp")
    public ResponseDto signUP(@RequestBody SignUpDto requestBody){
        ResponseDto result = authService.signUp(requestBody);
        return result;
    }

    @PostMapping("/logIn")
    public ResponseDto login(@RequestBody LogInDto logInDto){
        System.out.println(logInDto.toString());
        return null ;
    }

    @PatchMapping("/logout")
    public ResponseDto modify(@RequestBody LogOutDto logOutDto){
        return null;
    }

    @DeleteMapping("/deleteuser")
    public ResponseDto modify(@RequestBody DeleteDto deleteDto){
        return null;
    }

}
