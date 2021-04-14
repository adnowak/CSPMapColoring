package Algorithm;

import Models.*;

import java.util.ArrayList;

public class CSPSolver<T extends Problem> {
    private T problem;
    private final boolean forwardCheckingEnabled;
    private final VariableOrderHeuristic variableOrderHeuristic;
    private final ValueOrderHeuristic valueOrderHeuristic;
    private long visitedNodes = 0;
    private boolean countingNodesActive = true;

    public CSPSolver(T problem, boolean forwardCheckingEnabled) {
        this.problem = problem;
        this.forwardCheckingEnabled = forwardCheckingEnabled;
        this.variableOrderHeuristic = new RegularVariableHeuristic();
        this.valueOrderHeuristic = new RegularValueHeuristic();
    }

    public CSPSolver(T problem, boolean forwardCheckingEnabled, VariableOrderHeuristic heuristic) {
        this.problem = problem;
        this.forwardCheckingEnabled = forwardCheckingEnabled;
        this.variableOrderHeuristic = heuristic;
        this.valueOrderHeuristic = new RegularValueHeuristic();
    }

    public CSPSolver(T problem, boolean forwardCheckingEnabled, ValueOrderHeuristic heuristic) {
        this.problem = problem;
        this.forwardCheckingEnabled = forwardCheckingEnabled;
        this.variableOrderHeuristic = new RegularVariableHeuristic();
        this.valueOrderHeuristic = heuristic;
    }

    public CSPSolver(T problem, boolean forwardCheckingEnabled, VariableOrderHeuristic variableOrderHeuristic, ValueOrderHeuristic valueOrderHeuristic) {
        this.problem = problem;
        this.forwardCheckingEnabled = forwardCheckingEnabled;
        this.variableOrderHeuristic = variableOrderHeuristic;
        this.valueOrderHeuristic = valueOrderHeuristic;
    }

    public ArrayList<T> getBacktrackSolutions(){
        problem.setVariables(variableOrderHeuristic.getNewOrder(problem.getVariables()));
        return getBacktrackSolutions(problem.getVariables(), 0);
    }

    public ArrayList<T> getBacktrackSolutions(ArrayList<Variable> variables, int variableIndex){
        ArrayList solutions = new ArrayList<>();
        variables.get(variableIndex).setDomain(valueOrderHeuristic.getNewOrder(variables.get(variableIndex).getDomain()));

        for (int i=0; i<variables.get(variableIndex).getDomain().size(); i++) {
            if(variables.get(variableIndex).checkConstraintSatisfiedWithValue(variables.get(variableIndex).getDomain().get(i))){
                variables.get(variableIndex).setValue(variables.get(variableIndex).getDomain().get(i));

                if(variableIndex < variables.size()-1){
                    if(forwardCheckingEnabled){
                        forwardCheck(variables, variableIndex+1);
                    }
                    solutions.addAll(getBacktrackSolutions(variables, variableIndex+1));
                }
                else if(problem.isSolved()){
                    solutions.add(problem.getCopy());
                    countingNodesActive = false;
                }
            }

            if(forwardCheckingEnabled && variableIndex < variables.size()-1){
                variables.get(variableIndex+1).resetDomain();
            }

            variables.get(variableIndex).setValue(0);
        }

        return solutions;
    }

    public void forwardCheck(ArrayList<Variable> variables, int variableIndex){
        ArrayList<Integer> inconsistentElements = new ArrayList<>();
        for (Integer element: variables.get(variableIndex).getDomain()) {
            if(!variables.get(variableIndex).checkConstraintSatisfiedWithValue(element)){
                inconsistentElements.add(element);
            }
        }

        variables.get(variableIndex).getDomain().removeAll(inconsistentElements);
    }

    public long getVisitedNodes() {
        return visitedNodes;
    }
}
