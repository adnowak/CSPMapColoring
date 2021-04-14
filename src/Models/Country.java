package Models;

import java.util.ArrayList;

public class Country extends Variable{
    private ArrayList<Country> neighbours;
    private int domainSize;

    public Country(int domainSize){
        this.domainSize = domainSize;
        value = 0;
        neighbours = new ArrayList<>();
        domain = new ArrayList<>();
        for(int i=0; i<domainSize; i++){
            domain.add(i+1);
        }
    }

    public Country(Country baseCountry){
        domainSize = baseCountry.domainSize;
        value = baseCountry.getValue();
        neighbours = baseCountry.getNeighbours();
        domain = new ArrayList<>();
        domain.addAll(baseCountry.getDomain());
    }

    public boolean checkConstraintSatisfiedWithValue(int value){
        for (Country neighbour : neighbours) {
            if(neighbour.getValue() == value){
                return false;
            }
        }
        return true;
    }

    @Override
    public void resetDomain() {
        domain = new ArrayList<>();
        for(int i=0; i<domainSize; i++){
            domain.add(i+1);
        }
    }

    public void addNeighbour(Country neighbour){
        neighbours.add(neighbour);
    }

    public void setNeighbours(ArrayList<Country> neighbours) {
        this.neighbours = neighbours;
    }

    public ArrayList<Country> getNeighbours() {
        return neighbours;
    }
}
