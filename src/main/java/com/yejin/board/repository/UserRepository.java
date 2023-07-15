package com.yejin.board.repository;

import com.yejin.board.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
     boolean existsByIdAndPassword(String userId, String userPwd);
     UserEntity findByUserId(String userId);


}
