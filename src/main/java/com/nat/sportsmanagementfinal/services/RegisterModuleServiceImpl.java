package com.nat.sportsmanagementfinal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nat.sportsmanagementfinal.entities.Drinksbought;
import com.nat.sportsmanagementfinal.entities.Player;
import com.nat.sportsmanagementfinal.entities.Sportsubscription;
import com.nat.sportsmanagementfinal.repositories.DrinksboughtRepository;
import com.nat.sportsmanagementfinal.repositories.PlayerRepository;
import com.nat.sportsmanagementfinal.repositories.SportsubscriptionRepository;

@Service
public class RegisterModuleServiceImpl implements RegisterModuleService {
	
	@Autowired
	PlayerRepository playerRepository;
	
	@Autowired
	SportsubscriptionRepository sportsubscriptionRepository;
	
	@Autowired
	DrinksboughtRepository drinksboughtRepository;

	@Override
	public String registerPlayer(Player player) {
		playerRepository.save(player);
		return "Player registered successfully";
	}

	@Override
	public String subscribeRegisterPlayertoSports(Sportsubscription sportsubscription) {
		sportsubscriptionRepository.save(sportsubscription);
		return "Players sport subscription successful";
	}

	@Override
	public String sellDrinktoPlayer(Drinksbought drinksbought) {
		drinksboughtRepository.save(drinksbought);
		return "Drink sold to player successfully";
	}
	
	@Override
	public List<Sportsubscription> allplayersPerActivity(int sportid) {
		return  sportsubscriptionRepository.allplayersPerActivity(sportid);
	}

	@Override
	public List<Drinksbought> boughtaParticularDrink(int playerid) {
		return drinksboughtRepository.boughtaParticularDrink(playerid);
	}

	@Override
	public List<Sportsubscription> getAllSubscriptions() {
		return sportsubscriptionRepository.findAll();
	}

	@Override
	public List<Drinksbought> getAllDrinksBought() {
		return drinksboughtRepository.findAll();
	}

}
