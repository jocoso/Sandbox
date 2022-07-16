package com.builder.abs;

public class SkinEngineer {
	private CharacterBuilder cb;
	
	public SkinEngineer(CharacterBuilder cb) {
		this.cb = cb;
	}
	
	public Character getCharacter() {
		return this.cb.getCharacter();
	}
	
	public void constructCharacter(String name, String description) {
		this.cb.buildBase(name, description);
		this.cb.buildAlliance();
		this.cb.buildClass();
		this.cb.buildRace();
	}
}
