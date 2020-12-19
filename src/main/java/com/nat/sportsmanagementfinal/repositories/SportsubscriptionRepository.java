package com.nat.sportsmanagementfinal.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nat.sportsmanagementfinal.entities.Player;
import com.nat.sportsmanagementfinal.entities.Sportsubscription;

@Repository
@Transactional
public interface SportsubscriptionRepository extends JpaRepository<Sportsubscription, Integer> {
	
	@Query("from Sportsubscription s where s.sport.sportid = :sportid")
	List<Sportsubscription> allplayersPerActivity(@Param("sportid") Integer sportid);

}
