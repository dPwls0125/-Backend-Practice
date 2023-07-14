package com.yejin.board.repository;

import com.yejin.board.entity.EvaluationBoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationRepository extends JpaRepository<EvaluationBoardEntity,Integer> {

}
