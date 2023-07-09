package com.patterns.strategy;

import com.patterns.strategy.behave.impl.Squaking;

public class RedHeadDuck extends Duck{

	
	public RedHeadDuck() {
		quackable = new Squaking();
	}
	
	@Override
	public void display() {
		System.out.print("Displaying Read Head Duck ....");
	}
	
	public void performQuck() {
		quackable.quack();
	}
}
