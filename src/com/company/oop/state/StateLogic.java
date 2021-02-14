package com.company.oop.state;

import java.util.ArrayList;
import java.util.List;

public class StateLogic {
    public void stateCapital(State state){
        String findCapital = state.getCapitalName();
        System.out.println(findCapital);

    }
    public List<String> printRegionList(State state){
        List<Region> result = state.getRegionList();
        List<String> regionList = new ArrayList<>();
        for (Region finder:result) {
            if (finder.getRegionalCenter() != null){
                regionList.add(finder.getRegionalCenter());
            }
        }
        return regionList;


    }
    public Integer amountOfRegions(State state){
        List<Region> regionList = new ArrayList<>();
        regionList = state.getRegionList();
        Integer counter= 0;
        for (Region finder:regionList) {
            if (finder != null){
                counter++;
            }
        }
        return counter;
    }
    public Double  square(State state){
        List<Region> result = state.getRegionList();
        Double squareSum = 0.0;
        for (Region finder:result) {
            squareSum = squareSum+ finder.getRegionSquare();
        }
    return squareSum;
    }


}
