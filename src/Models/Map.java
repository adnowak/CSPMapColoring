package Models;

import java.util.ArrayList;

public class Map {
    private ArrayList<Country> countries;

    public Map(ArrayList<Country> countries) {
        this.countries = countries;
    }

    public Map(Map baseMap){
        countries = new ArrayList<>();
        for (Country baseCountry: baseMap.countries) {
            countries.add(new Country(baseCountry));
        }
    }

    public boolean checkConstraintsSatisfied(){
        for (Country country : countries) {
            if(!country.checkConstraintSatisfied() || country.getColor() == 0){
                return false;
            }
        }
        return true;
    }

    public ArrayList<Country> getCountries() {
        return countries;
    }
}
