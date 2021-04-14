package Models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MostConstrainedVariableHeuristic extends VariableOrderHeuristic{

    @Override
    public ArrayList<Variable> getNewOrder(ArrayList<Variable> base) {
        Collections.sort(base, new VariableComparator());
        return base;
    }

    class VariableComparator implements Comparator<Variable> {
        @Override
        public int compare(Variable variable1, Variable variable2) {
            if(variable1.getDomain().size()>variable2.getDomain().size()){
                return 1;
            }
            else if(variable1.getDomain().size()<variable2.getDomain().size()){
                return -1;
            }
            return 0;
        }
    }
}
