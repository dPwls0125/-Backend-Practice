package com.yejin.board.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class SignUpDto {

    private String userEmail;
    private String userPw;
    private String userId;

    @NonNull
    private String checkUserPw;

}
