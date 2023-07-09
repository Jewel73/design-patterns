package com.patterns.strategy.behave.impl;

import com.patterns.strategy.behave.Flyable;

public class FlyingSkill implements Flyable{

	@Override
	public void fly() {
		
		System.out.println("Flying duck...........");
		
	}

}
