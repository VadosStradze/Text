package com.company.oop.state;

public class Test {
    public static void main(String[] args) {
        StateLogic logic = new StateLogic();
        State state = new State("Belarus", "Minsk");
        Region region = new Region(200.20);
        Region region1 = new Region(500.80);
        District district = new District("Minsk");
        District district1 = new District("Brest");
        City city = new City("Minsk");
        City city1 = new City("Brest");
        City city2 = new City("Gomel");
        City city3 = new City("Grodno");
        City city4 = new City("Mogilev");
        City city5 = new City("Vitebsk");
        City city6 = new City("Borisov");


        district.addCity(city);
        district.addCity(city6);
        district1.addCity(city1);
        region.addDistrict(district);
        region1.addDistrict(district1);

        state.addRegion(region);
        state.addRegion(region1);


        System.out.println(state);

        logic.stateCapital(state);
        System.out.println(logic.amountOfRegions(state));
        System.out.println(logic.square(state));
        System.out.println(logic.printRegionList(state));

    }
}
