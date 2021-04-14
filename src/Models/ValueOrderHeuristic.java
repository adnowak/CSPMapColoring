package Models;

import java.util.ArrayList;

public abstract class ValueOrderHeuristic {
    public abstract ArrayList<Integer> getNewOrder(ArrayList<Integer> base);
}
