package com.yejin.board.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class LogOutDto {
    @NonNull
    private String userId;

    @NonNull
    private String userPw;

    @NonNull
    private String userEmail;

}
