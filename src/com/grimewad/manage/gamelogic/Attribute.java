package com.grimewad.manage.gamelogic;

public enum Attribute {
	
	SHOOTING("Shooting"), HEADING("Heading"), PASSING("Passing"), CROSSING("Crossing");
	
	private String name;
	
	private Attribute(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}

}
