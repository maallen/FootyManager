package com.grimewad.manage.gamelogic.enums;

public enum PassOutcome {
	SUCCESSFUL("Successful"), INTERCEPTED("Intercepted"), THROW_IN("Throw in"), CORNER_KICK("Corner kick");
	
	private String outcome;
	
	private PassOutcome(String outcome){
		this.outcome = outcome;
	}
	
	public String toString(){
		return outcome;
	}
}
