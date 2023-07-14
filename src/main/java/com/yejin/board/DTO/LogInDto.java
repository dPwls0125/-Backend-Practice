package com.yejin.board.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class LogInDto {
    @NonNull
    private String userId;

    @NonNull
    private String userPw;

    private String userEmail;
}
