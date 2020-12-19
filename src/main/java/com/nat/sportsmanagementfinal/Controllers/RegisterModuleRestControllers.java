package com.nat.sportsmanagementfinal.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nat.sportsmanagementfinal.entities.Drinksbought;
import com.nat.sportsmanagementfinal.entities.Player;
import com.nat.sportsmanagementfinal.entities.Sportsubscription;
import com.nat.sportsmanagementfinal.services.RegisterModuleService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/registerModule")
public class RegisterModuleRestControllers {

	@Autowired
	RegisterModuleService registerModuleService;

	@PostMapping("/player")
	public String registerPlayer(@RequestBody Player player) {
		registerModuleService.registerPlayer(player);
		return "Player registered successfully";
	}

	@PostMapping("/subscription")
	public String subscribeRegisterPlayertoSports(@RequestBody Sportsubscription sportsubscription) {
		registerModuleService.subscribeRegisterPlayertoSports(sportsubscription);
		return "Player game subscription successful";
	}
	
	@GetMapping("/subscription")
	public List<Sportsubscription> getAllSubscriptions(){
		return registerModuleService.getAllSubscriptions();
	}

	@GetMapping("/activityplayers/{id}")
	public List<Sportsubscription> allplayersPerActivity(@PathVariable("id") int id) {
		return registerModuleService.allplayersPerActivity(id);
	}

	@PostMapping("/selldrink")
	public String sellDrinktoPlayer(@RequestBody Drinksbought drinksbought) {
		registerModuleService.sellDrinktoPlayer(drinksbought);
		return "Drink sold to player successful";
	}
	
	@GetMapping("/getdrinksbought")
	public List<Drinksbought> getAllDrinksBought(){
		return registerModuleService.getAllDrinksBought();
	}

	@GetMapping("/drinksboughtbyperson/{playerid}")
	public List<Drinksbought> boughtaParticularDrink(@PathVariable("playerid") int playerid) {
		return registerModuleService.boughtaParticularDrink(playerid);
	}

}
