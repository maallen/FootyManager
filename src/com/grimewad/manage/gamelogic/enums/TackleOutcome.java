package com.grimewad.manage.gamelogic.enums;

public enum TackleOutcome {
	WON_POSSESSION("Won possession"), WARNING("Warning from referee"),
	YELLOW_CARD("Yellow card"), RED_CARD("Red card"), MISSED_TACKLE("Missed tackle");
	
	private String name;
	
	private TackleOutcome(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}
