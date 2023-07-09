package com.patterns.strategy;

import com.patterns.strategy.behave.Flyable;
import com.patterns.strategy.behave.Quackable;

public abstract class Duck {
	
	public Flyable flyable;
	public Quackable quackable;
	
	
	public void swim() {
		System.out.println("Duck is swiming...");
	}
	
	public abstract void display();
}

/***
 * Problem: Now all duck is flying
 * Answer: We can override fly and keep empty where it is not needed.
 * 
 * Problem: We can override the function and keep empty where it is not needed.
 * Answer: Yeah we can do that, but it's not good design, unnecessary code, function in the classes exist
 * 
 * 
 * Problem: How to resolve unnecessary code ?
 * Answer : Lets create Flyable interface and implements all flyable duck.
 * 
 * Problem: But what if i need to do a small change in the fly? and also code is not reusable ?
 * 
 * Solution:
 * 
 * Make flyable and DoukSound interface and make concrete implementation
 * Inject Change able Behaviours on Runtime
 * 
 * 
 */
