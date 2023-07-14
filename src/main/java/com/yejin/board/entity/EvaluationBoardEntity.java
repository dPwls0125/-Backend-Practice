package com.yejin.board.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="board")
@Table(name="evaluationBoard")
public class EvaluationBoardEntity {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY) // 기본 키를 자동으로 생성해주는 어노테이션
    private int boardNumber;
    private String userId;
    private String lectureName;
    private String professorName;
    private String lectureYear;
    private String semesterDivide;
    private String evaluationTitle;
    private String evaluationContent;
    private String creditScore;
    private String lectureScore;
    private String comfortableScore;
    private String likeCount;


}
