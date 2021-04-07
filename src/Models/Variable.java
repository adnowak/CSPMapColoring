package Models;

import java.util.ArrayList;

public abstract class Variable {
    protected int value;
    protected ArrayList<Integer> domain;

    public boolean checkConstraintSatisfied(){
        return checkConstraintSatisfiedWithValue(value);
    }

    public abstract boolean checkConstraintSatisfiedWithValue(int value);

    public ArrayList<Integer> getDomain() {
        return domain;
    }

    public void setDomain(ArrayList<Integer> domain) {
        this.domain = domain;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
