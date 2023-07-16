package com.yejin.board.repository;

import com.yejin.board.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
     boolean existsByUserIdAndUserPwd(String userId, String userPwd);
     boolean existsByUserEmail(String userEmail);
     UserEntity findByUserId(String userId);
     UserEntity findByUserIdAndUserEmailAndUserPwd(String userId, String userEmail ,String userPwd);
}
