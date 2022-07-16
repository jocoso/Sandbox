package com.builder.cons;

import com.builder.abs.Character;
import com.builder.abs.CharacterBuilder;

public class AllyHumanMageBuilder implements CharacterBuilder {
	
	private Character character;
	
	public AllyHumanMageBuilder() {
		this.character = new Character();
	}
	
	@Override
	public void buildBase(String name, String description) {
		character.setBase(name, description);
	}

	@Override
	public void buildAlliance() {
		character.setAlliance("Ally");
	}

	@Override
	public void buildClass() {
		character.setClass("Mage");
	}

	@Override
	public void buildRace() {
		character.setRace("Human");
	}

	@Override
	public Character getCharacter() {
		// TODO Auto-generated method stub
		return this.character;
	}

	@Override
	public void reset() {
		this.character = new Character();
	}

}
