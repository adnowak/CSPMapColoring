package Models;

import java.util.ArrayList;
import java.util.Collections;

public class RandomVariableHeuristic extends VariableOrderHeuristic{
    @Override
    public ArrayList<Variable> getNewOrder(ArrayList<Variable> base) {
        ArrayList<Variable> newOrder = new ArrayList<>(base);
        Collections.shuffle(newOrder);
        return newOrder;
    }
}
