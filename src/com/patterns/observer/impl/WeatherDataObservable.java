package com.patterns.observer.impl;

import java.util.ArrayList;
import java.util.List;

/***
 * 
 * @author jewel
 * @date : 2023-07-10
 */
public class WeatherDataObservable implements Observable {
	
	private float tempreture;
	private float humidity;
	private float airPressure;
	private List<Observer> observers;
	
	
	public WeatherDataObservable() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void notifyObservers() {
		
		for(Observer observer: observers) {
			observer.update();
		}
		
	}


	public void messurementChangeEvent(float tempreture, float humidity, float airPressure) {
		this.airPressure = airPressure;
		this.humidity = humidity;
		this.tempreture = tempreture;
		notifyObservers();
	}
	

	public float getTempreture() {
		return tempreture;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getAirPressure() {
		return airPressure;
	}
	
	
	
	

}
