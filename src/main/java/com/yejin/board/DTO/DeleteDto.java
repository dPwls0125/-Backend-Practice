package com.yejin.board.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class DeleteDto {
    private String userId;
    private String userPw;
    private String userEmail;

    @NonNull
    private String checkUserPw;

}
