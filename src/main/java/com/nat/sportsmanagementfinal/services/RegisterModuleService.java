package com.nat.sportsmanagementfinal.services;

import java.util.List;

import com.nat.sportsmanagementfinal.entities.Drinksbought;
import com.nat.sportsmanagementfinal.entities.Player;
import com.nat.sportsmanagementfinal.entities.Sportsubscription;

public interface RegisterModuleService {
	
	public String registerPlayer(Player player);
	
	public String subscribeRegisterPlayertoSports(Sportsubscription sportsubscription);
	
	public List<Sportsubscription> allplayersPerActivity(int sportid);
	
	public String sellDrinktoPlayer(Drinksbought drinksbought);
	
	public List<Drinksbought> boughtaParticularDrink(int playerid);
	
	public List<Sportsubscription> getAllSubscriptions();
	
	public List<Drinksbought> getAllDrinksBought();

}
