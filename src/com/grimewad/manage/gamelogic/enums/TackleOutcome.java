package com.grimewad.manage.gamelogic.enums;

public enum TackleOutcome {
	
	WON_POSSESSION("Won possession"), WARNING("Warning from referee"), FREE_KICK("Free-kick"),
	PENALTY("Penalty"),	YELLOW_CARD("Yellow card"), RED_CARD("Red card"), 
	YELLOW_CARD_PENALTY("Penalty & yellow card given!"), RED_CARD_PENALTY("Penalty & sending off!!"),
	MISSED_TACKLE("Missed tackle");
	
	private String name;
	
	private TackleOutcome(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
}
