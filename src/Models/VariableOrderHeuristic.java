package Models;

import java.util.ArrayList;

public abstract class VariableOrderHeuristic {
    public abstract ArrayList<Variable> getNewOrder(ArrayList<Variable> base);
}
