package com.grimewad.manage.gamelogic;

import java.util.HashMap;
import java.util.Map;

public class Match {
	
	private static final String HOME = "Home";
	private static final String AWAY = "Away";
	
	private Team homeTeam;
	private Team awayTeam;
	private int homeGoals;
	private int awayGoals;
	
	public Match(Team homeTeam, Team awayTeam){
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
	}
	
	public Map<String, Team> getTeams(){
		HashMap<String, Team> teams = new HashMap<String, Team>();
		teams.put(HOME, homeTeam);
		teams.put(AWAY, awayTeam);
		return teams;
	}

	public int getHomeGoals() {
		return homeGoals;
	}

	public void setHomeGoals(int homeGoals) {
		this.homeGoals = homeGoals;
	}

	public int getAwayGoals() {
		return awayGoals;
	}

	public void setAwayGoals(int awayGoals) {
		this.awayGoals = awayGoals;
	}
	
	

}
