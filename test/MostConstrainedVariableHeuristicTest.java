import Models.MostConstrainedVariableHeuristic;
import Models.Variable;
import org.junit.Test;

import java.util.ArrayList;

public class MostConstrainedVariableHeuristicTest {
    @Test
    public void testMostConstrainedVariableHeuristic(){
        ArrayList<Variable> variables = new ArrayList<>();
        variables.add(new Variable() {
            @Override
            public ArrayList<Integer> getDomain(){
                ArrayList<Integer> domain = new ArrayList<>();
                domain.add(1);
                domain.add(2);
                return domain;
            }

            @Override
            public boolean checkConstraintSatisfiedWithValue(int value) {
                return false;
            }

            @Override
            public void resetDomain() {

            }
        });
        variables.add(new Variable() {
            @Override
            public ArrayList<Integer> getDomain(){
                ArrayList<Integer> domain = new ArrayList<>();
                domain.add(1);
                return domain;
            }

            @Override
            public boolean checkConstraintSatisfiedWithValue(int value) {
                return false;
            }

            @Override
            public void resetDomain() {

            }
        });

        ArrayList<Variable> newOrder = new MostConstrainedVariableHeuristic().getNewOrder(variables);
        for (Variable variable: newOrder) {
            System.out.println(variable.getDomain().size());
        }
    }
}
