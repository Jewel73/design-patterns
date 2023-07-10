package com.patterns.observer;

import com.patterns.observer.impl.RadioStationWeatherObserver;
import com.patterns.observer.impl.TvStationWeatherObserver;
import com.patterns.observer.impl.WeatherDataObservable;

/***
 * 
 * @author jewel
 * @date 2023-07-10
 */
public class WeatherStation {

	public static void main(String[] args) throws InterruptedException {
		
		WeatherDataObservable weatherDataObservable = new WeatherDataObservable();

		TvStationWeatherObserver observer1 = new TvStationWeatherObserver(weatherDataObservable);
		RadioStationWeatherObserver observer2 = new RadioStationWeatherObserver(weatherDataObservable);
		
		weatherDataObservable.messurementChangeEvent(23, 93, 93);
		Thread.sleep(1000);
		weatherDataObservable.messurementChangeEvent(34, 34, 34);
		Thread.sleep(1000);
		weatherDataObservable.messurementChangeEvent(56, 7, 89);
	}

}
