package Models;

import java.util.ArrayList;

public class Map extends Problem<Country>{
    public Map(ArrayList<Country> variables) {
        this.variables = variables;
    }

    public Map(Map baseMap){
        variables = new ArrayList<>();
        for (Country baseCountry: baseMap.variables) {
            variables.add(new Country(baseCountry));
        }
    }

    @Override
    public Map getCopy() {
        return new Map(this);
    }
}
