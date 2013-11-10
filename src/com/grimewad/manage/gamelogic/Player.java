package com.grimewad.manage.gamelogic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.grimewad.manage.gamelogic.enums.Attribute;
import com.grimewad.manage.gamelogic.enums.Injury;
import com.grimewad.manage.gamelogic.enums.PassOutcome;
import com.grimewad.manage.gamelogic.enums.PlayerRating;
import com.grimewad.manage.gamelogic.enums.Position;
import com.grimewad.manage.gamelogic.enums.TackleOutcome;

public class Player {
	
	private int age;
	private String name;
	private List<Position> positions;
	private Map<String, Integer> attributes;
	private boolean injured = false;
	private Injury injury;
	private int rehabWeeksLeft = 0;
	private PlayerRating playerRating;
	
	public Player(String name, int age, List<Position> position, PlayerRating playerRating){
		this.name = name;
		this.age = age;
		this.positions = position;
		this.playerRating = playerRating;
		this.attributes = generateAttributesMap(this);
	}
	
	public static final Map<String, Integer> generateAttributesMap(Player player){
		Map<String, Integer> attributeMap = new HashMap<String, Integer>();
		Attribute[] attributes = Attribute.values();
		for(Attribute attribute: attributes){
			int randomRating = (0 + (int)(Math.random()* 20)) + player.getPlayerRating().getRatingBonus();
			if (randomRating > 20){
				randomRating = 20;
			}
			attributeMap.put(attribute.toString(), randomRating);
		}
		return attributeMap;
	}

	public boolean isInjured() {
		return injured;
	}

	public void setInjured(boolean injured) {
		this.injured = injured;
	}

	public Injury getInjury() {
		return injury;
	}

	public void setInjury(Injury injury) {
		this.injury = injury;
		rehabWeeksLeft = injury.getWeeksOut();
	}
	
	public int getRehabWeeksLeft(){
		return rehabWeeksLeft;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public List<Position> getPosition() {
		return positions;
	}
	
	public void learnNewPosition(Position position){
		positions.add(position);
	}

	public Map<String, Integer> getAttributes() {
		return attributes;
	}
	
	public PassOutcome pass(Player intendedTarget){
		return PassOutcome.SUCCESSFUL;
	}
	
	public TackleOutcome tackle(Player playerInPossession){
		return TackleOutcome.WON_POSSESSION;
	}
	
	public PlayerRating getPlayerRating(){
		return playerRating;
	}

}
