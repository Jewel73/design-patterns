package com.patterns.observer.impl;

public class TvStationWeatherObserver implements Observer , DisplayWeather{

	 private float temperature;
	 private float humidity;
	 private float airPressure;
	 private WeatherDataObservable weatherData;
	 
	 public TvStationWeatherObserver(WeatherDataObservable observable) {
		this.weatherData = observable;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update() {
		this.temperature = weatherData.getTempreture();
		this.airPressure = weatherData.getAirPressure();
		this.humidity = weatherData.getHumidity();
		display();

	}

	@Override
	public void display() {
		System.out.println(
				"TvStationWeatherObserver [temperature=" + temperature + ", humidity=" + humidity + ", airPressure="
						+ airPressure + "]"
				);
		
	}



}
