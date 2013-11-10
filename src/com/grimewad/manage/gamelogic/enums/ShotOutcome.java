package com.grimewad.manage.gamelogic.enums;

public enum ShotOutcome {
	
	GOAL("Goal"), SAVE("Save"), BLOCKED("Blocked"), WIDE("Wide"),
	CORNER_KICK("Corner kick");
	
	private String name;
	
	private ShotOutcome(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}

}
