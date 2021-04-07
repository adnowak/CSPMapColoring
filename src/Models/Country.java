package Models;

import java.util.ArrayList;

public class Country extends Variable{
    private ArrayList<Country> neighbours;

    public Country(int domainSize){
        value = 0;
        neighbours = new ArrayList<>();
        domain = new ArrayList<>();
        for(int i=0; i<domainSize; i++){
            domain.add(i+1);
        }
    }

    public Country(Country baseCountry){
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
