package com.nat.sportsmanagementfinal.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nat.sportsmanagementfinal.entities.Drink;
import com.nat.sportsmanagementfinal.entities.Player;
import com.nat.sportsmanagementfinal.entities.Sport;
import com.nat.sportsmanagementfinal.entities.Staff;
import com.nat.sportsmanagementfinal.services.PersonnelModuleService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/personnelModule")
public class PersonnelModuleRestControllers {

	@Autowired
	PersonnelModuleService personnelModuleService;

	@PostMapping("/staff")
	public String registerStaff(@RequestBody Staff staff) {
		personnelModuleService.registerStaff(staff);
		return "Staff created succesfully";
	}
	
	@GetMapping("/staff")
	List<Staff> getAllStaff(){
		return personnelModuleService.getAllStaff();
	}

	@PostMapping("/drink")
	public String addDrink(@RequestBody Drink drink) {
		personnelModuleService.addDrink(drink);
		return "Drink added successfully";
	}
	
	@GetMapping("/drink")
	List<Drink> getAllDrinks(){
		return personnelModuleService.getDrinks();
	}

	@PostMapping("/sport")
	public String addSport(@RequestBody Sport sport) {
		personnelModuleService.addSport(sport);
		return "Game added successfully";
	}
	
	@GetMapping("/sport")
	List<Sport> getAllSports(){
		return personnelModuleService.getSports();
	}

	@GetMapping("/players")
	List<Player> getAllPlayers(){
		return personnelModuleService.getAllPlayers();
	}

}
