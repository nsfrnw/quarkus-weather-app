package com.epam.model;

public class WeatherResponseModel {
	
	private double temp;
	private double pressure;
	private double humidity;
	private double temp_min;
	private double temp_max;
	private double grnd_level;
	private double sea_level;
	private double feels_like;
	private double latitude;
	private double longitude;
	private int statuscode;
	private String message;
	
	public WeatherResponseModel() {
		super();
	}
	
	public WeatherResponseModel(double temp, double pressure, double humidity, double temp_min, double temp_max,
			double grnd_level, double sea_level, double feels_like, double latitude, double longitude, int statuscode,
			String message) {
		super();
		this.temp = temp;
		this.pressure = pressure;
		this.humidity = humidity;
		this.temp_min = temp_min;
		this.temp_max = temp_max;
		this.grnd_level = grnd_level;
		this.sea_level = sea_level;
		this.feels_like = feels_like;
		this.latitude = latitude;
		this.longitude = longitude;
		this.statuscode = statuscode;
		this.message = message;
	}

	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public double getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(double temp_min) {
		this.temp_min = temp_min;
	}
	public double getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(double temp_max) {
		this.temp_max = temp_max;
	}
	public double getGrnd_level() {
		return grnd_level;
	}
	public void setGrnd_level(double grnd_level) {
		this.grnd_level = grnd_level;
	}
	public double getSea_level() {
		return sea_level;
	}
	public void setSea_level(double sea_level) {
		this.sea_level = sea_level;
	}
	public double getFeels_like() {
		return feels_like;
	}
	public void setFeels_like(double feels_like) {
		this.feels_like = feels_like;
	}
	public double getLatitude() {
		return latitude;
	}
    public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
    public double getLongitude() {
		return longitude;
	}
    public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
    public int getStatuscode() {
		return statuscode;
	}
    public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
    public String getMessage() {
		return message;
	}
    public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "WeatherResponseModel [temp=" + temp + ", pressure=" + pressure + ", humidity=" + humidity
				+ ", temp_min=" + temp_min + ", temp_max=" + temp_max + ", grnd_level=" + grnd_level + ", sea_level="
				+ sea_level + ", feels_like=" + feels_like + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", statuscode=" + statuscode + ", message=" + message + "]";
	}

	

}
