package com.nat.sportsmanagementfinal.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sportsubscription database table.
 * 
 */
@Entity
@NamedQuery(name="Sportsubscription.findAll", query="SELECT s FROM Sportsubscription s")
public class Sportsubscription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subscriptionid;

	//bi-directional many-to-one association to Player
	@ManyToOne()
	@JoinColumn(name="playerid")
	private Player player;

	//bi-directional many-to-one association to Sport
	@ManyToOne()
	@JoinColumn(name="sportid")
	private Sport sport;

	public Sportsubscription() {
	}
	
	public Sportsubscription(int playerid, int sportid) {
		super();
		player = new Player();
		sport = new Sport();
		this.player.setPlayerid(playerid);
		this.sport.setSportid(sportid);
	}




	public int getSubscriptionid() {
		return this.subscriptionid;
	}

	public void setSubscriptionid(int subscriptionid) {
		this.subscriptionid = subscriptionid;
	}

	public Player getPlayer() {
		return this.player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Sport getSport() {
		return this.sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

}