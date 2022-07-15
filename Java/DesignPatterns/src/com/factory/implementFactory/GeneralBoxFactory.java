package com.factory.implementFactory;

import com.factory.abstractFactory.Box;
import com.factory.abstractFactory.BoxFactory;

public class GeneralBoxFactory {

	public Box createBox(BoxFactory f, String surprise) {
		return f.createBox(surprise);
	}
	
	public void openBox(Box box) {
		System.out.println(box.open());
	}
	
}
