package com.nat.sportsmanagementfinal.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the sport database table.
 * 
 */
@Entity
@NamedQuery(name="Sport.findAll", query="SELECT s FROM Sport s")
public class Sport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sportid;

	private String sportsname;

	//bi-directional many-to-one association to Sportsubscription
	@JsonIgnore
	@OneToMany(mappedBy="sport")
	private List<Sportsubscription> sportsubscriptions;

	public Sport() {
	}

	public Sport(String sportsname) {
		super();
		this.sportsname = sportsname;
	}


	public int getSportid() {
		return this.sportid;
	}

	public void setSportid(int sportid) {
		this.sportid = sportid;
	}

	public String getSportsname() {
		return this.sportsname;
	}

	public void setSportsname(String sportsname) {
		this.sportsname = sportsname;
	}

	public List<Sportsubscription> getSportsubscriptions() {
		return this.sportsubscriptions;
	}

	public void setSportsubscriptions(List<Sportsubscription> sportsubscriptions) {
		this.sportsubscriptions = sportsubscriptions;
	}

	public Sportsubscription addSportsubscription(Sportsubscription sportsubscription) {
		getSportsubscriptions().add(sportsubscription);
		sportsubscription.setSport(this);

		return sportsubscription;
	}

	public Sportsubscription removeSportsubscription(Sportsubscription sportsubscription) {
		getSportsubscriptions().remove(sportsubscription);
		sportsubscription.setSport(null);

		return sportsubscription;
	}

}