package com.patterns.strategy.behave.impl;

import com.patterns.strategy.behave.Flyable;

public class RocketFlyingSkill implements Flyable{

	@Override
	public void fly() {
		
		System.out.println("Duck Rocket flying....");
		
	}

}
