package com.epam.exercises.bean;

import java.io.Serializable;

public class Tank implements Serializable{
	
	private String name;
	private String type;
	private String gunType;
	private String nation;
	
	public void training(){
		System.out.println(nation + " " + type + " tank with "+gunType + "is called: "+ name );
	}
		

}
