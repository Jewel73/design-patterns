package com.patterns.strategy.behave.impl;

import com.patterns.strategy.behave.Quackable;

public class Squaking implements Quackable{

	@Override
	public void quack() {
		System.out.println("Squake Squack.....");
		
	}

}
