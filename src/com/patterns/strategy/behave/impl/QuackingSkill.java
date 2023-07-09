package com.patterns.strategy.behave.impl;

import com.patterns.strategy.behave.Quackable;

public class QuackingSkill implements Quackable{

	@Override
	public void quack() {
		System.out.println("Quack Quack....");
		
	}

}
