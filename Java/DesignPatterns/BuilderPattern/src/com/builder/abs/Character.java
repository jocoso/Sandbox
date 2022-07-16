package com.builder.abs;

public class Character implements CharacterPlan {
	
	private String name, description;
	private String alliance;
	private String cl;
	private String race;

	public Character() {
		this.reset();
	}
	
	@Override
	public void reset() {
		name = "";
		description = "";
		alliance = "";
		cl = "";
		race = "";
		
	}

	@Override
	public void setBase(String name, String description) {
		this.name = name;
		this.description = description;
		
	}

	@Override
	public void setAlliance(String alliance) {
		this.alliance = alliance;
		
	}

	@Override
	public void setClass(String cl) {
		this.cl = cl;
		
	}

	@Override
	public void setRace(String race) {
		this.race = race;
		
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\n" +
		"Description: " + description + "\n" +
		"Alliance: " + alliance + "\n" +
		"Class: " + cl + "\n" +
		"Race: " + race + "\n";
		
		
	}

}
