package com.nat.sportsmanagementfinal.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nat.sportsmanagementfinal.entities.Sport;

@Repository
@Transactional
public interface SportRepository extends JpaRepository<Sport, Integer> {

}
