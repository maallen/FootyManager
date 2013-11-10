package com.grimewad.manage.gamelogic;

public enum PlayerRating {
	
	WORLD_CLASS("World Class", 10), VERY_GOOD("Very Good", 8), GOOD("Good", 6),
	AVERAGE("Average", 5), POOR("Poor", 3), AWFUL("Awful", 1);
	
	private String rating;
	private int multiplier;
	
	private PlayerRating(String rating, int multiplier){
		this.rating = rating;
		this.multiplier = multiplier;
	}

}
