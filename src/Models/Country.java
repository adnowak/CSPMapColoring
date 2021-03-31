package Models;

import java.util.ArrayList;

public class Country {
    private int color;
    private ArrayList<Country> neighbours;
    private ArrayList<Integer> domain;

    public Country(int domainSize){
        color = 0;
        neighbours = new ArrayList<>();
        this.domain = new ArrayList<>();
        for(int i=0; i<domainSize; i++){
            domain.add(i+1);
        }
    }

    public Country(Country baseCountry){
        color = baseCountry.getColor();
        neighbours = baseCountry.getNeighbours();
        domain = new ArrayList<>();
        domain.addAll(baseCountry.getDomain());
    }

    public boolean checkConstraintSatisfied(){
        return checkConstraintSatisfiedWithColor(color);
    }

    public boolean checkConstraintSatisfiedWithColor(int color){
        for (Country neighbour : neighbours) {
            if(neighbour.getColor() == color){
                return false;
            }
        }
        return true;
    }

    public void addNeighbour(Country neighbour){
        neighbours.add(neighbour);
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public ArrayList<Country> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(ArrayList<Country> neighbours) {
        this.neighbours = neighbours;
    }

    public ArrayList<Integer> getDomain() {
        return domain;
    }

    public void setDomain(ArrayList<Integer> domain) {
        this.domain = domain;
    }
}
