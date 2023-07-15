package com.yejin.board.controller;

import com.yejin.board.DTO.*;
import com.yejin.board.service.AuthService;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@ToString
public class AuthController {
    final
    AuthService authService ;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/signUp")
    public ResponseDto signUp(@RequestBody SignUpDto requestBody){
        ResponseDto result = authService.signUp(requestBody);
        return result;
    }

    @PostMapping("/logIn")
    public ResponseDto login(@RequestBody LogInDto requestBody){
        System.out.println(requestBody);
        ResponseDto result = authService.logIn(requestBody);
        return null;
    }

    @PatchMapping("/logOut")
    public ResponseDto modify(@RequestBody LogOutDto logOutDto){
        return null;
    }

    @DeleteMapping("/deleteUser")
    public ResponseDto modify(@RequestBody DeleteDto deleteDto){
        return null;
    }

}
