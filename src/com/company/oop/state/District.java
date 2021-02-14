package com.company.oop.state;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class District {
        private String districtName;
        private String districtCenter;
        private List<City> cityList;

    public District(String districtCenter) {
        cityList = new ArrayList<>();
        this.districtCenter = districtCenter;
    }

    public void addCity(City city){
        this.districtName = city.getCityName();
        cityList.add(city);

    }

    public String getDistrictCenter() {
        return districtCenter;
    }

    public void setDistrictCenter(String districtCenter) {
        this.districtCenter = districtCenter;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    @Override
    public String toString() {
        return "District{" +
                "districtName='" + districtName + '\'' +
                ", districtCenter='" + districtCenter + '\'' +
                ", cityList=" + cityList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Objects.equals(districtName, district.districtName) && Objects.equals(districtCenter, district.districtCenter) && Objects.equals(cityList, district.cityList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(districtName, districtCenter, cityList);
    }
}
