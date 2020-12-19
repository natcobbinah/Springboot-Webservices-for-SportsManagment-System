package com.nat.sportsmanagementfinal.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the drinksbought database table.
 * 
 */
@Entity
@NamedQuery(name="Drinksbought.findAll", query="SELECT d FROM Drinksbought d")
public class Drinksbought implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	private Date boughtdate;

	//bi-directional many-to-one association to Player
	@ManyToOne()
	@JoinColumn(name="playerid")
	private Player player;

	//bi-directional many-to-one association to Drink
	@ManyToOne()
	@JoinColumn(name="drinkid")
	private Drink drink;

	public Drinksbought() {
	}

	public Drinksbought(Date boughtdate, int playerid, int drinkid) {
		super();
		player = new Player();
		drink = new Drink();
		this.boughtdate = boughtdate;
		this.player.setPlayerid(playerid);
		this.drink.setDrinkid(drinkid);
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBoughtdate() {
		return this.boughtdate;
	}

	public void setBoughtdate(Date boughtdate) {
		this.boughtdate = boughtdate;
	}

	public Player getPlayer() {
		return this.player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Drink getDrink() {
		return this.drink;
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}

}