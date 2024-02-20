
package com.demo.LearningPortal.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.LearningPortal.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

}