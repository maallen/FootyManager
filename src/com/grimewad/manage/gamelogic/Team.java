package com.grimewad.manage.gamelogic;

import java.util.List;

public class Team implements Comparable<Team>{
	
	private String name;
	private int gamesPlayed = 0;
	private int gamesWon = 0;
	private int gamesLost = 0;
	private int gamesDrawn = 0;
	private int goalsScored = 0;
	private int goalsConceded = 0;
	private List<Player> players;
	
	public Team(String name, List<Player> players){
		this.name = name;
		this.players = players;
	}
	

	public int getGamesPlayed() {
		return gamesPlayed;
	}



	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}



	public int getGamesWon() {
		return gamesWon;
	}



	public void setGamesWon(int gamesWon) {
		this.gamesWon = gamesWon;
	}



	public int getGamesLost() {
		return gamesLost;
	}



	public void setGamesLost(int gamesLost) {
		this.gamesLost = gamesLost;
	}



	public int getGamesDrawn() {
		return gamesDrawn;
	}



	public void setGamesDrawn(int gamesDrawn) {
		this.gamesDrawn = gamesDrawn;
	}



	public int getGoalsScored() {
		return goalsScored;
	}



	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}



	public int getGoalsConceded() {
		return goalsConceded;
	}



	public void setGoalsConceded(int goalsConceded) {
		this.goalsConceded = goalsConceded;
	}


	public String getName() {
		return name;
	}


	public List<Player> getPlayers() {
		return players;
	}

	public void addPlayer(Player player){
		players.add(player);
	}
	
	public void removePlayer(Player player){
		players.remove(player);
	}
	
	public int calculatePoints(){
		int gamesWonPoints = gamesWon * 3;
		return gamesWonPoints + gamesDrawn;
	}
	
	public int calculateGoalDiff(){
		return goalsScored - goalsConceded;
	}

	@Override
	public int compareTo(Team another) {
		final int GREATER = 1;
		final int LESSER = -1;
		final int EQUAL = 0;
		if (this.calculatePoints() > another.calculatePoints()){
			return GREATER;
		}
		else if (this.calculatePoints() == another.calculatePoints()){
			if (this.calculateGoalDiff() > another.calculateGoalDiff())
				return GREATER;
			else if (this.calculateGoalDiff() == another.calculateGoalDiff()){
				if(this.goalsScored > another.goalsScored){
					return GREATER;
				}
				else if (this.goalsScored == another.goalsScored){
					return EQUAL;
				}
				else{
					return LESSER;
				}
			}
		}
		return LESSER;
	}

}
