package com.yejin.board.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EvaluationDto {
    private String userID;
    private String lectureName;
    private String professorName;
    private String lectureYear;
    private String SemesterDivide;
    private String evaluationTitle;
    private String evaluationContent;
    private String creditScore;
    private String lectureScore;
    private String comfortableScore;
}
