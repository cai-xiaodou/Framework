package cn.com.sandi.pattern.observer;

public class ObserverTestMain {

	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData(26.62, "多云转晴");
		new WeatherStation(weatherData, "Observer-1");
		new WeatherStation(weatherData, "Observer-2");
		new WeatherStation(weatherData, "Observer-3");
		weatherData.notice();
		
		
	}
}
