package Models;

import java.util.ArrayList;
import java.util.Collections;

public class RandomValueHeuristic extends ValueOrderHeuristic{
    @Override
    public ArrayList<Integer> getNewOrder(ArrayList<Integer> base) {
        ArrayList<Integer> newOrder = new ArrayList<>(base);
        Collections.shuffle(newOrder);
        return newOrder;
    }
}
