package Models;

import java.util.ArrayList;

public class HouseConfiguration extends Variable{
    private int houseIndex;
    private ArrayList<HouseConfiguration> neighbours;
    private ArrayList<HouseConfiguration> otherHouses;
    private EinsteinProblem baseProblem;
    //nationality = (value-1)%5
    //color = ((value-1)/5)%5
    //drink = ((value-1)/25)%5
    //smoke = ((value-1)/125)%5
    //animal = (value-1)/625
    //
    //    pierwszy dom	drugi dom	            trzeci dom	            czwarty dom	        piąty dom
    //
    //    Norweg	    Duńczyk	                Anglik	                Niemiec	            Szwed
    //    żółty	        niebieski	            czerwony	            zielony	            biały
    //    woda	        herbata	                mleko	                kawa	            piwo
    //    cygara	    papierosy   light	    papierosy bez filtra	fajka	            papierosy mentolowe
    //    koty	        konie	                ptaki	                rybki	            psy
    //    0             1                       2                       3                   4
    public HouseConfiguration(int houseIndex, EinsteinProblem baseProblem){
        this.houseIndex = houseIndex;
        this.neighbours = new ArrayList<>();
        this.otherHouses = new ArrayList<>();
        this.baseProblem = baseProblem;
        value = 0;
        domain = new ArrayList<>();
        for(int i=0; i<3125; i++){
            domain.add(i+1);
        }
    }

    public HouseConfiguration(HouseConfiguration base){
        houseIndex = base.getHouseIndex();
        neighbours = base.getNeighbours();
        otherHouses = base.getOtherHouses();
        baseProblem = base.baseProblem;
        value = base.getValue();
        domain = new ArrayList<>();
        domain.addAll(base.getDomain());
    }

    @Override
    public boolean checkConstraintSatisfiedWithValue(int value) {
        int nationality = (value-1)%5;
        int color = ((value-1)/5)%5;
        int drink = ((value-1)/25)%5;
        int smoke = ((value-1)/125)%5;
        int animal = (value-1)/625;

        for (HouseConfiguration otherHouse: otherHouses) {
            if(otherHouse.getNationality() == nationality && otherHouse.getValue()!=0){
                return false;
            }

            if(otherHouse.getColor() == color && otherHouse.getValue()!=0){
                return false;
            }

            if(otherHouse.getDrink() == drink && otherHouse.getValue()!=0){
                return false;
            }

            if(otherHouse.getSmoke() == smoke && otherHouse.getValue()!=0){
                return false;
            }

            if(otherHouse.getAnimal() == animal && otherHouse.getValue()!=0){
                return false;
            }
        }

        //norweg mieszka w pierwszym domu
        if(houseIndex == 0 && nationality!=0){
            return false;
        }

        //anglik mieszka w czerwonym domu
        if(nationality == 2 && color != 2){
            return false;
        }

        //zielony dom znajduje się bezpośrednio po lewej stronie domu białego
        if(color == 3){
            boolean whiteOnRight = false;

            for (HouseConfiguration neighbour: neighbours) {
                if (neighbour.getHouseIndex() - 1 == houseIndex && (neighbour.getColor() == 4 || neighbour.getValue() == 0)) {
                    whiteOnRight = true;
                    break;
                }
            }

            if(!whiteOnRight){
                return false;
            }
        }

        //duńczyk pija herbatę
        if(nationality == 1 && drink!=1){
            return false;
        }

        //palacz papierosów light mieszka obok hodowcy kotów
        if(smoke == 1){
            boolean neighboursCat = false;

            for (HouseConfiguration neighbour: neighbours) {
                if (neighbour.getAnimal() == 0 || neighbour.getValue() == 0) {
                    neighboursCat = true;
                    break;
                }
            }

            if(!neighboursCat){
                return false;
            }
        }

        //mieszkaniec żółtego domu pali cygara
        if(color == 0 && smoke!=0){
            return false;
        }

        //niemiec pali fajkę
        if(nationality == 3 && smoke!=3){
            return false;
        }

        //mieszkaniec środkowego domu pija mleko
        if(houseIndex == 2 && drink != 2){
            return false;
        }

        //palacz papierosów light ma sąsiada, który pija wodę.
        if(smoke == 1){
            boolean neighboursWater = false;

            for (HouseConfiguration neighbour: neighbours) {
                if (neighbour.getDrink() == 0 || neighbour.getValue() == 0) {
                    neighboursWater = true;
                    break;
                }
            }

            if(!neighboursWater){
                return false;
            }
        }

        //palacz papierosów bez filtra hoduje ptaki
        if(smoke == 2 && animal != 2){
            return false;
        }

        //szwed hoduje psy
        if(nationality == 4 && animal != 4){
            return false;
        }

        //norweg mieszka obok niebieskiego domu
        if(nationality == 0){
            boolean neighboursBlue = false;

            for (HouseConfiguration neighbour: neighbours) {
                if (neighbour.getColor() == 1 || neighbour.getValue() == 0) {
                    neighboursBlue = true;
                    break;
                }
            }

            if(!neighboursBlue){
                return false;
            }
        }

        //hodowca koni mieszka obok żółtego domu
        if(animal == 1){
            boolean neighboursYellow = false;

            for (HouseConfiguration neighbour: neighbours) {
                if (neighbour.getColor() == 0 || neighbour.getValue() == 0) {
                    neighboursYellow = true;
                    break;
                }
            }

            if(!neighboursYellow){
                return false;
            }
        }

        //palacz mentolowych pija piwo
        if(smoke == 4 && drink != 4){
            return false;
        }

        //w zielonym domu pija się kawę
        if(color == 3 && drink != 3){
            return false;
        }

        return true;
    }

    @Override
    public void resetDomain() {
        domain = new ArrayList<>();
        for(int i=0; i<3125; i++){
            domain.add(i+1);
        }
    }

    public int getHouseIndex() {
        return houseIndex;
    }

    public ArrayList<HouseConfiguration> getNeighbours() {
        return neighbours;
    }

    public void addNeighbour(HouseConfiguration neighbour) {
        this.neighbours.add(neighbour);
    }

    public void setNeighbours(ArrayList<HouseConfiguration> neighbours) {
        this.neighbours = neighbours;
    }

    public void addOtherHouse(HouseConfiguration otherHouse) {
        this.otherHouses.add(otherHouse);
    }

    public ArrayList<HouseConfiguration> getOtherHouses() {
        return otherHouses;
    }

    public EinsteinProblem getBaseProblem() {
        return baseProblem;
    }

    public int getNationality(){
        return (value-1)%5;
    }

    public int getColor(){
        return ((value-1)/5)%5;
    }

    public int getDrink(){
        return ((value-1)/25)%5;
    }

    public int getSmoke(){
        return ((value-1)/125)%5;
    }

    public int getAnimal(){
        return (value-1)/625;
    }
}
