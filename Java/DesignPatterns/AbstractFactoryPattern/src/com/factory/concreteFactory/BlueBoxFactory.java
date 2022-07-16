package com.factory.concreteFactory;

import com.factory.abstractFactory.Box;
import com.factory.abstractFactory.BoxFactory;

public class BlueBoxFactory implements BoxFactory {

	@Override
	public Box createBox(String surprise) {
		return new BlueBox(surprise);
	}
	
}
