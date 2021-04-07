package Algorithm;

import Models.Problem;
import Models.Variable;

import java.util.ArrayList;

public class CSPSolver<T extends Problem> {
    private T problem;

    public CSPSolver(T problem) {
        this.problem = problem;
    }

    public ArrayList<T> getBacktrackSolutions(){
        return getBacktrackSolutions(problem.getVariables(), 0);
    }

    public ArrayList<T> getBacktrackSolutions(ArrayList<Variable> variables, int variableIndex){
        ArrayList solutions = new ArrayList<>();

        for (int i=0; i<variables.get(variableIndex).getDomain().size(); i++) {
            if(variables.get(variableIndex).checkConstraintSatisfiedWithValue(variables.get(variableIndex).getDomain().get(i))){
                variables.get(variableIndex).setValue(variables.get(variableIndex).getDomain().get(i));
                if(variableIndex < variables.size()-1){
                    solutions.addAll(getBacktrackSolutions(variables, variableIndex+1));
                }
                else if(problem.isSolved()){
                    solutions.add(problem.getCopy());
                }
            }

            variables.get(variableIndex).setValue(0);
        }

        return solutions;
    }
}
