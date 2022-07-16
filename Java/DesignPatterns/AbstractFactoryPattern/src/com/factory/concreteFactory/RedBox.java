package com.factory.concreteFactory;

import com.factory.abstractFactory.Box;

public class RedBox extends Box {
	
	public RedBox(String surprise) {
		this.surprise = surprise;
	}
	
	@Override
	public String open() {
		return "You open the red box and find a " + this.surprise + ".";
	}
}
