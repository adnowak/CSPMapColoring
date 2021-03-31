package Algorithm;

import Models.Country;
import Models.Map;

import java.util.ArrayList;

public class MapColouringCSP {
    private Map map;

    public MapColouringCSP(Map map) {
        this.map = map;
    }

    public ArrayList<Map> getBacktrackSolutions(){
        return getBacktrackSolutions(map.getCountries(), 0);
    }

    public ArrayList<Map> getBacktrackSolutions(ArrayList<Country> countries, int countryIndex){
        ArrayList<Map> solutions = new ArrayList<>();

        for (int i=0; i<countries.get(countryIndex).getDomain().size(); i++) {
            if(countries.get(countryIndex).checkConstraintSatisfiedWithColor(countries.get(countryIndex).getDomain().get(i))){
                countries.get(countryIndex).setColor(countries.get(countryIndex).getDomain().get(i));
                if(countryIndex < countries.size()-1){
                    solutions.addAll(getBacktrackSolutions(countries, countryIndex+1));
                }
                else{
                    solutions.add(new Map(map));
                }
            }

            countries.get(countryIndex).setColor(0);
        }

        return solutions;
    }
}
