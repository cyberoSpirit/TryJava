package CityPopulation;

import java.util.HashMap;

public class CityPopulationTracker {
    private HashMap<String, City> cityPopulations;

    public CityPopulationTracker() {
        this.cityPopulations = new HashMap<>();
    }

    public City getCity(String city) {
        if (cityPopulations.containsKey(city)) {
            return new City(cityPopulations.get(city));
        }
        return null;
    }

    public void addCity(City city) {
        cityPopulations.put(city.getName(), new City(city));
    }
}
