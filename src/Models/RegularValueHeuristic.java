package Models;

import java.util.ArrayList;

public class RegularValueHeuristic extends ValueOrderHeuristic{
    @Override
    public ArrayList<Integer> getNewOrder(ArrayList<Integer> base) {
        return base;
    }
}
