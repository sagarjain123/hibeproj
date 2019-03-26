package com.om.sagar;

import java.io.Serializable;

public class Weapon1DTO implements Serializable {
	
	public Weapon1DTO() {
		System.out.println("Weapon1DTO obj is created");
	}
	
	private int weapon1Id;
	private String weapon1Name;
	private String weapon1Model;
	private double weapon1Cost;
	
	
	public int getWeapon1Id() {
		return weapon1Id;
	}
	public void setWeapon1Id(int weapon1Id) {
		this.weapon1Id = weapon1Id;
	}
	public String getWeapon1Name() {
		return weapon1Name;
	}
	public void setWeapon1Name(String weapon1Name) {
		this.weapon1Name = weapon1Name;
	}
	public String getWeapon1Model() {
		return weapon1Model;
	}
	public void setWeapon1Model(String weapon1Model) {
		this.weapon1Model = weapon1Model;
	}
	public double getWeapon1Cost() {
		return weapon1Cost;
	}
	public void setWeapon1Cost(double weapon1Cost) {
		this.weapon1Cost = weapon1Cost;
	}
	
	

}
