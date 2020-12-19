package com.nat.sportsmanagementfinal;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nat.sportsmanagementfinal.entities.Drink;
import com.nat.sportsmanagementfinal.entities.Drinksbought;
import com.nat.sportsmanagementfinal.entities.Player;
import com.nat.sportsmanagementfinal.entities.Sport;
import com.nat.sportsmanagementfinal.entities.Sportsubscription;
import com.nat.sportsmanagementfinal.entities.Staff;
import com.nat.sportsmanagementfinal.repositories.DrinkRepository;
import com.nat.sportsmanagementfinal.repositories.DrinksboughtRepository;
import com.nat.sportsmanagementfinal.repositories.PlayerRepository;
import com.nat.sportsmanagementfinal.repositories.SportRepository;
import com.nat.sportsmanagementfinal.repositories.SportsubscriptionRepository;
import com.nat.sportsmanagementfinal.repositories.StaffRepository;

@SpringBootTest
class SportsManagementFinalApplicationTests {
	
	@Autowired
	StaffRepository staffRepository;
	
	@Autowired
	DrinkRepository drinkRepository;
	
	@Autowired
	SportRepository sportRepository;
	
	@Autowired
	PlayerRepository playerRepository;
	
	@Autowired
	SportsubscriptionRepository sportsubscriptionRepository;
	
	@Autowired
	DrinksboughtRepository drinksboughtRepository;
	
	@Test
	public void addStaff() {
		staffRepository.save(new Staff("Helloviewer","Helloviewer",874765));
	}
	
	@Test
	public void getStaff(){
		List<Staff> liststaff = staffRepository.findAll();
		System.out.println(liststaff);
	}
	
	@Test
	public void addDrink() {
		drinkRepository.save(new Drink(new BigDecimal(1000),"Baileys","Alcholic"));
	}
	
	@Test
	public void getDrink(){
		List<Drink> list = drinkRepository.findAll();
		System.out.println(list);
	}
	
	@Test
	public void addPlayer() {
		playerRepository.save(new Player("Joseph","Abuanor","Anaji"));
	}
	
	@Test
	public void getPlayer(){
		List<Player> list = playerRepository.findAll();
		System.out.println(list);
	}
	
	@Test
	public void addSport() {
		sportRepository.save(new Sport("Swimming"));
	}
	
	@Test
	public void getSport(){
		List<Sport> list = sportRepository.findAll();
		System.out.println(list);
	}
	
	
	@Test
	public void addSportsubscription() {
		sportsubscriptionRepository.save(new Sportsubscription(1,3));
	}
	
	@Test
	public void getSportSubscription(){
		List<Sportsubscription> list = sportsubscriptionRepository.findAll();
		System.out.println(list);
	}
	
	//Date boughtdate, int playerid, int drinkid
	
	@Test
	public void addDrinksBought() {
		drinksboughtRepository.save(new Drinksbought(new Date(),1,2));
	}
}






