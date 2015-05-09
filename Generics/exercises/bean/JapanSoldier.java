package com.epam.exercises.bean;

import com.epam.exercises.implement.Soldier;
import com.epam.exercises.implement.Weapon;

public class JapanSoldier implements Soldier{
	
	private Weapon weapon;
	
	public JapanSoldier(Weapon weapon) {
		this.weapon = weapon;
	}

	@Override
	public void fightingWith() {
		weapon.attack();
	}

	@Override
	public void defendingWith() {
		weapon.defend();
		weapon.defend();
		weapon.defend();
	}

	@Override
	public String toString() {
		return "JapanSoldier with: " +weapon;
	}

	public Weapon getWeapon() {
		return weapon;
	}
	

	
}
