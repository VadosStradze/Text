package com.company.oop.state;

import java.util.ArrayList;
import java.util.List;

public class State {
    private String stateName;
    private String capitalName;
    private List<Region> regionList;

    public State(String stateName, String capitalName) {
        this.stateName= stateName;
        this.capitalName = capitalName;
        this.regionList = new ArrayList<>();

    }
    public State(){

    }
    public void addRegion(Region region){
        regionList.add(region);
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public List<Region> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<Region> regionList) {
        this.regionList = regionList;
    }

    @Override
    public String toString() {
        return "State{" +
                "stateName='" + stateName + '\'' +
                ", capitalName='" + capitalName + '\'' +
                ", regionList=" + regionList +
                '}';
    }
}
