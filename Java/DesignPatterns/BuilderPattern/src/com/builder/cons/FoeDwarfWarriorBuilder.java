package com.builder.cons;

import com.builder.abs.Character;
import com.builder.abs.CharacterBuilder;

public class FoeDwarfWarriorBuilder implements CharacterBuilder {

	private Character character;
	
	public FoeDwarfWarriorBuilder() {
		this.character = new Character();
	}
	
	@Override
	public void buildBase(String name, String description) {
		character.setBase(name, description);
	}

	@Override
	public void buildAlliance() {
		character.setAlliance("Foe");
	}

	@Override
	public void buildClass() {
		character.setClass("Warrior");
	}

	@Override
	public void buildRace() {
		character.setRace("Dwarf");
	}

	@Override
	public Character getCharacter() {
		return this.character;
	}

}
