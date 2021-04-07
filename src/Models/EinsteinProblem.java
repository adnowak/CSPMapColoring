package Models;

import java.util.ArrayList;

public class EinsteinProblem extends Problem<HouseConfiguration>{
    public EinsteinProblem(ArrayList<HouseConfiguration> variables){
        this.variables = variables;
    }

    public EinsteinProblem(EinsteinProblem base){
        variables = new ArrayList<>();
        for (HouseConfiguration baseVariable: base.variables) {
            variables.add(new HouseConfiguration(baseVariable));
        }
    }

    @Override
    public Problem<HouseConfiguration> getCopy() {
        return new EinsteinProblem(this);
    }
}
