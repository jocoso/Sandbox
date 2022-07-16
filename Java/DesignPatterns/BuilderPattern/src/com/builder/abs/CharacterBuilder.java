package com.builder.abs;

public interface CharacterBuilder {
	public void reset();
	public void buildBase(String name, String description);
	public void buildAlliance();
	public void buildClass();
	public void buildRace();
	public Character getCharacter();
}
