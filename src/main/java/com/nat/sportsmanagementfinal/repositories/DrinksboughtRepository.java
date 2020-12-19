package com.nat.sportsmanagementfinal.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nat.sportsmanagementfinal.entities.Drinksbought;


@Repository
@Transactional
public interface DrinksboughtRepository extends JpaRepository<Drinksbought, Integer> {

	@Query("from Drinksbought d where d.player.playerid = :id")
	List<Drinksbought> boughtaParticularDrink(@Param("id") Integer id);
}
