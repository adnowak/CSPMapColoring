package Models;

import java.util.ArrayList;

public abstract class Problem<T extends Variable> {
    protected ArrayList<T> variables;

    public boolean isSolved(){
        for (T variable: variables) {
            if(!variable.checkConstraintSatisfied()){
                return false;
            }
        }
        return true;
    }

    public ArrayList<T> getVariables() {
        return variables;
    }

    public void setVariables(ArrayList<T> variables) {
        this.variables = variables;
    }

    public abstract Problem<T> getCopy();
}
