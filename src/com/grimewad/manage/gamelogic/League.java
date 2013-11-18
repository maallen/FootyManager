package com.grimewad.manage.gamelogic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class League {
	
	private List<Team> teams;
	private Map<Team, List<Team>> fixtures;
	
	public League(List<String> teamNames){	
		createTeams(teamNames);
	}
	
	public League(Map<Manager, String> teamNames){
		createTeams(teamNames);
	}
	
	private void createTeams(List<String> teamNames){
		for(String teamName: teamNames){
			List<Player> players = new ArrayList<Player>(); // TODO: create random list of players
			Team team = new Team(teamName, players);
			teams.add(team);
		}
	}
	
	private void createTeams(Map<Manager, String> teamNames){
		Set<Manager> managers = teamNames.keySet();
		Iterator<Manager> iterator = managers.iterator();
		while (iterator.hasNext()){
			Manager manager = iterator.next();
			String teamName = teamNames.get(manager);
			List<Player> players = new ArrayList<Player>(); // TODO: create random list of players
			Team team = new Team(teamName, players);
			team.setManager(manager);
			teams.add(team);
		}
	}
	
	public Map<Team, List<Team>> getFixtures(){
		return fixtures;
	}

}
