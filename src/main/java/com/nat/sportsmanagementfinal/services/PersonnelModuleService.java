package com.nat.sportsmanagementfinal.services;

import java.util.List;

import com.nat.sportsmanagementfinal.entities.Drink;
import com.nat.sportsmanagementfinal.entities.Player;
import com.nat.sportsmanagementfinal.entities.Sport;
import com.nat.sportsmanagementfinal.entities.Staff;

public interface PersonnelModuleService {

	public String registerStaff(Staff staff);
	
	public String addDrink(Drink drink);
	
	public String addSport(Sport sport);
	
	List<Staff> getAllStaff();

	List<Player> getAllPlayers();
	
	List<Drink> getDrinks();
	
	List<Sport> getSports();
}
