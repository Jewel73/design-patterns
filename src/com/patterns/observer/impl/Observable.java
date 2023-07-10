package com.patterns.observer.impl;

public interface Observable {
	
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();

}
