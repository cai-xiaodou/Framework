package cn.com.sandi.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class WeatherStation implements Observer{

	private String name;
	private Observable observable;
	
	
	public WeatherStation(Observable observable,String name) {
		this.observable = observable;
		this.name = name;
		observable.addObserver(this);
	}


	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Object arg: "+arg.toString());
		WeatherData data = (WeatherData) o;
		double temperature = data.getTemperature();
		String weather = data.getWeather();
		System.out.println(name+"：接收到数据变化，天气："+weather+"，温度："+temperature);
		
	}

	public Observable getObservable() {
		return observable;
	}


	public void setObservable(Observable observable) {
		this.observable = observable;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
