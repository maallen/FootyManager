package com.grimewad.manage.gamelogic.enums;

public enum PlayerRating {
	
	WORLD_CLASS("World Class", 10), VERY_GOOD("Very Good", 8), GOOD("Good", 6),
	AVERAGE("Average", 5), POOR("Poor", 2), AWFUL("Awful", 0);
	
	private String rating;
	private int ratingBonus;
	
	private PlayerRating(String rating, int multiplier){
		this.rating = rating;
		this.ratingBonus = multiplier;
	}
	
	public int getRatingBonus(){
		return ratingBonus;
	}
	
	public String toString(){
		return rating;
	}

}
