package com.nat.sportsmanagementfinal.entities;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the drinks database table.
 * 
 */
@Entity
@Table(name="drinks")
@NamedQuery(name="Drink.findAll", query="SELECT d FROM Drink d")
public class Drink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int drinkid;

	private BigDecimal drinkcost;

	private String drinkname;

	private String drinktype;

	//bi-directional many-to-one association to Drinksbought
	@JsonIgnore
	@OneToMany(mappedBy="drink")
	private List<Drinksbought> drinksboughts;

	public Drink() {
	}

	public Drink(BigDecimal drinkcost, String drinkname, String drinktype) {
		super();
		this.drinkcost = drinkcost;
		this.drinkname = drinkname;
		this.drinktype = drinktype;
	}



	public int getDrinkid() {
		return this.drinkid;
	}

	public void setDrinkid(int drinkid) {
		this.drinkid = drinkid;
	}

	public BigDecimal getDrinkcost() {
		return this.drinkcost;
	}

	public void setDrinkcost(BigDecimal drinkcost) {
		this.drinkcost = drinkcost;
	}

	public String getDrinkname() {
		return this.drinkname;
	}

	public void setDrinkname(String drinkname) {
		this.drinkname = drinkname;
	}

	public String getDrinktype() {
		return this.drinktype;
	}

	public void setDrinktype(String drinktype) {
		this.drinktype = drinktype;
	}

	public List<Drinksbought> getDrinksboughts() {
		return this.drinksboughts;
	}

	public void setDrinksboughts(List<Drinksbought> drinksboughts) {
		this.drinksboughts = drinksboughts;
	}

	public Drinksbought addDrinksbought(Drinksbought drinksbought) {
		getDrinksboughts().add(drinksbought);
		drinksbought.setDrink(this);

		return drinksbought;
	}

	public Drinksbought removeDrinksbought(Drinksbought drinksbought) {
		getDrinksboughts().remove(drinksbought);
		drinksbought.setDrink(null);

		return drinksbought;
	}

}