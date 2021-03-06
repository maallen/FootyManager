package com.grimewad.manage.gamelogic;

import java.util.ArrayList;
import java.util.List;

import com.grimewad.manage.gamelogic.enums.PlayerRating;

public class Team implements Comparable<Team>{
	
	private String name;
	private int gamesPlayed = 0;
	private int gamesWon = 0;
	private int gamesLost = 0;
	private int gamesDrawn = 0;
	private int goalsScored = 0;
	private int goalsConceded = 0;
	private List<Player> players;
	private List<Team> fixtureList;
	private Manager manager;
	private boolean isAvailable = true;
	
	public Team(String name){
		this.name = name;
		this.players = generateSquad();
	}
	
	public static final List<Player> generateSquad(){
		List<Player> players = new ArrayList<Player>();
		int i = 1;
		String name = "Player ";
		PlayerRating[] ratings = PlayerRating.values();
		int ratingsSize = ratings.length;
		while(i <= 23){
			PlayerRating rating = ratings[0 + (int)(Math.random() * (ratingsSize - 1))];
			int randomAge = 17 + (int)(Math.random() * 37);
			Player player = new Player(name+i, randomAge, rating);
			players.add(player);
			i++;
		}
		return players;
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
		
		final int GREATER_THAN = 1;
		final int LESS_THAN = -1;
		final int EQUAL = 0;
		
		if (this.calculatePoints() > another.calculatePoints()){
			return GREATER_THAN;
		}
		else if (this.calculatePoints() == another.calculatePoints()){
			if (this.calculateGoalDiff() > another.calculateGoalDiff()){
				return GREATER_THAN;
			}	
			else if (this.calculateGoalDiff() == another.calculateGoalDiff()){
				if(getGoalsScored() > another.getGoalsScored()){
					return GREATER_THAN;
				}
				else if (getGoalsScored() == another.getGoalsScored()){
					return EQUAL;
				}
				else{
					return LESS_THAN;
				}
			}
		}
		return LESS_THAN;
	}
	
	public void win(int goalsScored, int goalsConceded){
		gamesPlayed++;
		gamesWon++;
		this.goalsScored += goalsScored;
		this.goalsConceded += goalsConceded;
	}
	
	public void draw(int goalsScored, int goalsConceded){
		gamesPlayed++;
		gamesDrawn++;
		this.goalsScored += goalsScored;
		this.goalsConceded += goalsConceded;
	}
	
	public void lose(int goalsScored, int goalsConceded){
		gamesPlayed++;
		gamesLost++;
		this.goalsScored += goalsScored;
		this.goalsConceded += goalsConceded;
	}
	
	public List<Team> getFixtureList(){
		return fixtureList;
	}
	
	public void setFixturesList(List<Team> fixtureList){
		this.fixtureList = fixtureList;
	}


	public Manager getManager() {
		return manager;
	}


	public boolean isAvailable() {
		return isAvailable;
	}


	public void setManager(Manager manager) {
		this.manager = manager;
		isAvailable = false;
	}


	public void removeManager() {
		this.manager = null;
		isAvailable = true;
	}

}
