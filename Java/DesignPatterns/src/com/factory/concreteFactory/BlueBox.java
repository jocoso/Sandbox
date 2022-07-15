package com.factory.concreteFactory;

import com.factory.abstractFactory.Box;

public class BlueBox extends Box {
	public BlueBox(String surprise) {
		this.surprise = surprise;
	}
	
	@Override
	public String open() {
		return "You open the Blue box and find a " + this.surprise + ".";
	}

}
