package com.LearningPortal.example.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.LearningPortal.example.Entities.FavouriteEntity;
@Repository
public interface FavouriteRepository extends JpaRepository<FavouriteEntity, Long>{

}
