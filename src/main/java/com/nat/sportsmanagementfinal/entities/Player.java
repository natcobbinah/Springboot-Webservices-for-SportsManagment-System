package com.nat.sportsmanagementfinal.entities;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the players database table.
 * 
 */
@Entity
@Table(name="players")
@NamedQuery(name="Player.findAll", query="SELECT p FROM Player p")
public class Player implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int playerid;

	private String firstname;

	private String lastname;

	private String location;

	//bi-directional many-to-one association to Drinksbought
	@JsonIgnore
	@OneToMany(mappedBy="player")
	private List<Drinksbought> drinksboughts;

	//bi-directional many-to-one association to Sportsubscription
	@JsonIgnore
	@OneToMany(mappedBy="player")
	private List<Sportsubscription> sportsubscriptions;

	public Player() {
	}
	
	public Player(String firstname, String lastname, String location) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.location = location;
	}


	public int getPlayerid() {
		return this.playerid;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<Drinksbought> getDrinksboughts() {
		return this.drinksboughts;
	}

	public void setDrinksboughts(List<Drinksbought> drinksboughts) {
		this.drinksboughts = drinksboughts;
	}

	public Drinksbought addDrinksbought(Drinksbought drinksbought) {
		getDrinksboughts().add(drinksbought);
		drinksbought.setPlayer(this);

		return drinksbought;
	}

	public Drinksbought removeDrinksbought(Drinksbought drinksbought) {
		getDrinksboughts().remove(drinksbought);
		drinksbought.setPlayer(null);

		return drinksbought;
	}

	public List<Sportsubscription> getSportsubscriptions() {
		return this.sportsubscriptions;
	}

	public void setSportsubscriptions(List<Sportsubscription> sportsubscriptions) {
		this.sportsubscriptions = sportsubscriptions;
	}

	public Sportsubscription addSportsubscription(Sportsubscription sportsubscription) {
		getSportsubscriptions().add(sportsubscription);
		sportsubscription.setPlayer(this);

		return sportsubscription;
	}

	public Sportsubscription removeSportsubscription(Sportsubscription sportsubscription) {
		getSportsubscriptions().remove(sportsubscription);
		sportsubscription.setPlayer(null);

		return sportsubscription;
	}

}