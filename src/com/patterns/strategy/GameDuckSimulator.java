package com.patterns.strategy;

import com.patterns.strategy.behave.impl.RocketFlyingSkill;

public class GameDuckSimulator {

	public static void main(String[] args) {
		
		
		MallardDuck mallardDuck = new MallardDuck();
		
		mallardDuck.performFly();
		mallardDuck.performQuck();
		
		//change flying skill on runtime
		mallardDuck.setNewFlyingSkill(new RocketFlyingSkill());
		mallardDuck.performFly();
		

	}

}
