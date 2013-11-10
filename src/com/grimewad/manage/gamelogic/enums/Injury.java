package com.grimewad.manage.gamelogic.enums;

public enum Injury {
	HAMSTRING_STRAIN("Hamstring strain", 3), HAMSTRING_TEAR("Hamstring tear", 5), 
	BROKEN_METATARSAL("Broken metatarsal", 6), BROKEN_LEG("Broken leg", 26);
	
	private int weeksOut;
	private String name;
	
	private Injury(String name, int weeksOut){
		this.name = name;
		this.weeksOut = weeksOut;
	}
	
	public int getWeeksOut(){
		return weeksOut;
	}
	
	public String toString(){
		return name;
	}
}
