package com.demo.LearningPortal.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.LearningPortal.Entities.FavoriteEntity;

@Repository
public interface FavouriteRepository extends JpaRepository<FavoriteEntity,Long>{

}
