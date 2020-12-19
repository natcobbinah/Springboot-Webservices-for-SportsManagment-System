package com.nat.sportsmanagementfinal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nat.sportsmanagementfinal.entities.Drink;
import com.nat.sportsmanagementfinal.entities.Player;
import com.nat.sportsmanagementfinal.entities.Sport;
import com.nat.sportsmanagementfinal.entities.Staff;
import com.nat.sportsmanagementfinal.repositories.DrinkRepository;
import com.nat.sportsmanagementfinal.repositories.PlayerRepository;
import com.nat.sportsmanagementfinal.repositories.SportRepository;
import com.nat.sportsmanagementfinal.repositories.StaffRepository;

@Service
public class PersonnelModuleServiceImpl implements PersonnelModuleService {

	@Autowired
	StaffRepository staffRepository;
	
	@Autowired
	DrinkRepository drinkRepository;

	@Autowired
	PlayerRepository playerRepository;
	
	@Autowired
	SportRepository sportRepository;
	
	@Override
	public String registerStaff(Staff staff) {
		staffRepository.save(staff);
		return "Staff added succesfully";
	}

	@Override
	public String addDrink(Drink drink) {
		drinkRepository.save(drink);
		return "Drink added successfully";
	}

	@Override
	public String addSport(Sport sport) {
		sportRepository.save(sport);
		return "New sport added successfully";
	}

	@Override
	public List<Staff> getAllStaff() {
		return staffRepository.findAll();
	}

	@Override
	public List<Player> getAllPlayers() {
		return playerRepository.findAll();
	}

	@Override
	public List<Drink> getDrinks() {
		return drinkRepository.findAll();
	}

	@Override
	public List<Sport> getSports() {
		return sportRepository.findAll();
	}

}
