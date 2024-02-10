package com.LearningPortal.example.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.LearningPortal.example.Entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long>{

}
