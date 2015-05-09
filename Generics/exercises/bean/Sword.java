package com.epam.exercises.bean;

import com.epam.exercises.implement.Weapon;

public class Sword extends Weapon{
	
	public Sword(String name) {
		super(name);
	}

	public void Slashing(){
		System.out.println("Use slashing");
	}
}
