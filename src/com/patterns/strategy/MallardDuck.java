package com.patterns.strategy;

import com.patterns.strategy.behave.Flyable;
import com.patterns.strategy.behave.impl.FlyingSkill;
import com.patterns.strategy.behave.impl.QuackingSkill;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		flyable = new FlyingSkill();
		quackable = new QuackingSkill();
	}

	@Override
	public void display() {
		System.out.print("Displaying mallard Duck : -**- ");
	}
	
	public void performFly() {
		flyable.fly();
	}

	public void performQuck() {
		quackable.quack();
	}
	
	// change Fly behavior on runtime
	public void setNewFlyingSkill(Flyable flyable) {
		this.flyable = flyable;
	}
	
	
}
