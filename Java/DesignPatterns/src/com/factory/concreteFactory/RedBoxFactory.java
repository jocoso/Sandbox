package com.factory.concreteFactory;

import com.factory.abstractFactory.Box;
import com.factory.abstractFactory.BoxFactory;

public class RedBoxFactory implements BoxFactory {

	@Override
	public Box createBox(String surprise) {
		return new RedBox(surprise);
	}
	
}
