package com.epam.exercises.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.epam.exercises.implement.Soldier;
import com.epam.exercises.implement.Weapon;

public class Army {

	private List<Soldier> army = new ArrayList<>();
	
	public void recruitArmy(){
		for(int i = 0; i<100; i++){
			if(i%2 == 0){
				army.add(new JapanSoldier(new Katana("Katana")));
			}
			else{
				army.add(new GermanSoldier(new Sword("Sword")));
			}
			
		}
	}
	public void showArmy(){
		for(Soldier soldier : army){
			System.out.println(soldier);
			soldier.defendingWith();
			soldier.fightingWith();
			soldier.defendingWith();			
		}
	}
	
}
