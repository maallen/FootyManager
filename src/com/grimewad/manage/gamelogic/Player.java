package com.grimewad.manage.gamelogic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {
	
	private int age;
	private String name;
	private List<Position> positions;
	private Map<String, Integer> attributes;
	private boolean injured = false;
	private Injury injury;
	private int rehabWeeksLeft = 0;
	
	public Player(String name, int age, List<Position> position, Map<String, Integer> attributes){
		this.name = name;
		this.age = age;
		this.positions = position;
		this.attributes = attributes;
	}
	
	public static Map<String, Integer> generateAttributesMap(Position playersPosition){
		Map<String, Integer> attributeMap = new HashMap<String, Integer>();
		Attribute[] attributes = Attribute.values();
		for(Attribute attribute: attributes){
			int randomRating = 1 + (int)(Math.random()* 20);
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

}
