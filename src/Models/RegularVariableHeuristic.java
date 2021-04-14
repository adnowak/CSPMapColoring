package Models;

import java.util.ArrayList;

public class RegularVariableHeuristic extends VariableOrderHeuristic{
    @Override
    public ArrayList<Variable> getNewOrder(ArrayList<Variable> base) {
        return base;
    }
}
