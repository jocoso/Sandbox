package com.main;

import com.builder.abs.CharacterBuilder;
import com.builder.abs.SkinEngineer;
import com.builder.abs.Character;
import com.builder.cons.AllyHumanMageBuilder;
import com.builder.cons.FoeDwarfWarriorBuilder;

public class Builder {
	public static void main(String[] args) {
		CharacterBuilder ahm = new AllyHumanMageBuilder();
		CharacterBuilder fdw = new FoeDwarfWarriorBuilder();
		
		SkinEngineer ahm_engineer = new SkinEngineer(ahm);
		SkinEngineer fdw_engineer = new SkinEngineer(fdw);
		
		ahm_engineer.constructCharacter("Dana", "A great lady.");
		fdw_engineer.constructCharacter("Lady Rosa", "A formidable foe.");
		
		Character dana = ahm_engineer.getCharacter();
		Character ladyRosa = fdw_engineer.getCharacter();
		
		System.out.println("Character constructed: " + dana);
		System.out.println("Character constructed: " + ladyRosa);
	}
}
