package com.grimewad.manage.gamelogic;

public class Manager {
	
	private String name;
	private Team team;
	
	public Manager(String name, Team team){
		this.name = name;
		this.team = team;
	}
	
	public String getName(){
		return name;
	}
	
	public Team getTeam(){
		return team;
	}
	
	public void resign(){
		team = null;
	}

}
