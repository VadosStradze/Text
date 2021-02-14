package com.company.oop.state;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Region {
    private String regionName;
    private String regionalCenter;
    private Double regionSquare;
    private List<District> districtList;

    @Override
    public String toString() {
        return '\n'+"Region{" +
                "regionName='" + regionName + '\'' +
                ", regionalCenter='" + regionalCenter + '\'' +
                ", regionSquare=" + regionSquare +
                ", districtList=" + districtList +
                '}'+'\n';
    }

    public Region() {
        districtList = new ArrayList<>();
        this.regionSquare = regionSquare;

    }

    public Region(Double regionSquare) {
        this.regionSquare = regionSquare;
        districtList = new ArrayList<>();
    }

    public void addDistrict(District district) {
        regionalCenter = district.getDistrictCenter();
        this.regionName = regionalCenter + " region";
        districtList.add(district);
    }


    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionalCenter() {
        return regionalCenter;
    }

    public void setRegionalCenter(String regionalCenter) {
        this.regionalCenter = regionalCenter;
    }

    public Double getRegionSquare() {
        return regionSquare;
    }

    public void setRegionSquare(Double regionSquare) {
        this.regionSquare = regionSquare;
    }

    public List<District> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<District> districtList) {
        this.districtList = districtList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Objects.equals(regionName, region.regionName) && Objects.equals(regionalCenter, region.regionalCenter) && Objects.equals(regionSquare, region.regionSquare) && Objects.equals(districtList, region.districtList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionName, regionalCenter, regionSquare, districtList);
    }

}
