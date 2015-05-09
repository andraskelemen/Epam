package com.epam.exercises.bean;

import com.epam.exercises.implement.Weapon;

public class Katana extends Weapon {
	
	public Katana(String name) {
		super(name);
	}

	public void Slashing(){
		System.out.println("Use slashing");
	}
	
	public void Hacking(){
		System.out.println("Use Hacking");
	}
	
	
}
