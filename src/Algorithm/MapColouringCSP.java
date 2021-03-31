package Algorithm;

import Models.Country;
import Models.Map;

import java.util.ArrayList;

public class MapColouringCSP {
    private Map baseMap;

    public MapColouringCSP(Map baseMap) {
        this.baseMap = baseMap;
    }

    public ArrayList<Map> getBackPropSolutions(){
        ArrayList<Map> solutions = new ArrayList<>();
//
//        for (int i=0;i<baseMap.getCountries().size(); i++) {
//            System.out.println();
//            for (int j=0; j<baseMap.getCountries().get(i).getDomain().size(); j++) {
//                System.out.println(baseMap.getCountries().get(i).getDomain().get(j)+":"+baseMap.getCountries().get(i).checkConstraintSatisfiedWithColor(baseMap.getCountries().get(i).getDomain().get(j)));
//                if(baseMap.getCountries().get(i).checkConstraintSatisfiedWithColor(baseMap.getCountries().get(i).getDomain().get(j))){
//                    baseMap.getCountries().get(i).setColor(baseMap.getCountries().get(i).getDomain().get(j));
//                    if(i==baseMap.getCountries().size()-1){
//                        solutions.add(new Map(baseMap));
//                    }
//                }
//            }
//        }

//        return solutions;
        return getBackPropSolutions(baseMap.getCountries(), 0);
    }

    public ArrayList<Map> getBackPropSolutions(ArrayList<Country> countries, int countryIndex){
        ArrayList<Map> solutions = new ArrayList<>();

        for (int i=0; i<countries.get(countryIndex).getDomain().size(); i++) {
            if(countries.get(countryIndex).checkConstraintSatisfiedWithColor(countries.get(countryIndex).getDomain().get(i))){
                countries.get(countryIndex).setColor(countries.get(countryIndex).getDomain().get(i));
                if(countryIndex < countries.size()-1){
                    solutions.addAll(getBackPropSolutions(countries, countryIndex+1));
                }
                else{
                    solutions.add(new Map(baseMap));
                }
            }

            countries.get(countryIndex).setColor(0);
        }

        return solutions;
    }
}
