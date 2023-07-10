package com.patterns.observer.impl;

public class RadioStationWeatherObserver implements Observer , DisplayWeather{

	private float temperature;
	private float humidity;
	private WeatherDataObservable weatherData;
	
	public RadioStationWeatherObserver(WeatherDataObservable weatherData) {
		this.weatherData = weatherData;
	}

	
	
	@Override
	public void update() {
		this.temperature = weatherData.getTempreture();
		this.humidity = weatherData.getHumidity();
		display();
	}


	@Override
	public void display() {
		System.out.println(
				"RadioStationWeatherObserver [temperature=" + temperature + ", humidity=" + humidity + "]"
				);
		
	}


	

}
