package com.epam.exercises.implement;

public abstract class Weapon {
	private String name;
	
	public Weapon(String name) {
		super();
		this.name = name;
	}

	public void attack(){
		System.out.println("Attacking with: " + name);
	}
	
	public void defend(){
		System.out.println("Defending with: " + name);
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

	
	
}
