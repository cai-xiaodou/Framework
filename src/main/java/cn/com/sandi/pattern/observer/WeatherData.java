package cn.com.sandi.pattern.observer;

import java.util.Observable;

public class WeatherData extends Observable{

	private double temperature;
	private String weather;
	
	public WeatherData(double temperature, String weather) {
		this.temperature = temperature;
		this.weather = weather;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}
	
	public void notice() {
		System.out.println("开始通知Observer数据发生变化。。。");
		super.setChanged();
		super.notifyObservers("天气数据发生变化");
	}
}
