
package com.demo.LearningPortal.Repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.LearningPortal.dto.FavouriteDto;
import com.demo.LearningPortal.entities.FavouriteEntity;

public interface FavouriteRepository extends JpaRepository<FavouriteEntity,Long> {
	
	 @Query(value = "SELECT f.*,u.userId,u.username FROM FavouriteEntity f JOIN UserEntity u ON f.learner_id = u.userId WHERE u.userId = :userId", nativeQuery = true)
	    List<FavouriteDto> findFavouritesByUserId(@Param("userId") Long userId);
}