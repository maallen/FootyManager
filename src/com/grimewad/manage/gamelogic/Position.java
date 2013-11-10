package com.grimewad.manage.gamelogic;

public enum Position {
	
	GOALKEEPER("Goalkeeper"), LEFT_BACK("Left-back"), CENTRE_BACK("Centre-back"), RIGHT_BACK("Right-back"), 
	DEFENSIVE_MIDFIELDER("Defensive midfielder"), LEFT_WINGER("Left winger"), 
	RIGHT_WINGER("Right winger"), CENTRE_MIDFIELD("Centre midfielder"), ATTACKING_MIDFIELDER("Attacking midfielder"),
	STRIKER("Striker");
	
	private String name;
	
	private Position(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}

}
