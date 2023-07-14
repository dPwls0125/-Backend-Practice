package com.yejin.board.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ModifyDto {
    private String userID;
    private String userPw;
    private String userEmail;

    private String lectureName;
    private String professorName;
    private String lectureYear;
    private String SemesterDivide;
    private String evaluationTitle;
    private String evaluationContent;
    private String creditScore;
    private String comfortableScore;
    private String lectureScore;
}
