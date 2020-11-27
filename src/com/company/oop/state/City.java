package com.company.oop.state;

public class City {
    private String cityName;

    public City(String cityName) {
        this.cityName = cityName;
    }
    public City(){

    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "City{" + cityName  + '}';
    }
}
