package com.grimewad.manage.gamelogic;

public class Manager {
	
	private String name;
	private Team team;
	
	public Manager(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setTeam(Team team){
		this.team = team;
	}
	
	public Team getTeam(){
		return team;
	}
	
	public void resign(){
		team.removeManager();
		team = null;
	}

}
