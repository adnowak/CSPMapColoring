import Algorithm.MapColouringCSP;
import Models.Country;
import Models.Map;
import Utils.MapGenerator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
//        new MapGenerator().generate(5);
        int domainSize = 3;

        Country poland = new Country(domainSize);
        Country czechia = new Country(domainSize);
        Country slovakia = new Country(domainSize);
        Country austria = new Country(domainSize);
        Country hungary = new Country(domainSize);
        Country uk = new Country(domainSize);
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(poland);
        countries.add(czechia);
        countries.add(slovakia);
        countries.add(austria);
        countries.add(hungary);
//        countries.add(uk);
        poland.addNeighbour(czechia);
        poland.addNeighbour(slovakia);
        czechia.addNeighbour(poland);
        czechia.addNeighbour(slovakia);
        czechia.addNeighbour(austria);
        slovakia.addNeighbour(poland);
        slovakia.addNeighbour(czechia);
        slovakia.addNeighbour(austria);
        slovakia.addNeighbour(hungary);
        austria.addNeighbour(czechia);
        austria.addNeighbour(slovakia);
        austria.addNeighbour(hungary);
        hungary.addNeighbour(slovakia);
        hungary.addNeighbour(austria);
        Map map = new Map(countries);

        ArrayList<Map> solutions = new MapColouringCSP(map).getBacktrackSolutions();
        System.out.println("Poland as a starting country");
        for (Map solution: solutions) {
            System.out.println();
            System.out.println("Next:");
            System.out.println("Poland: "+solution.getCountries().get(0).getColor());
            System.out.println("Czechia: "+solution.getCountries().get(1).getColor());
            System.out.println("Slovakia: "+solution.getCountries().get(2).getColor());
            System.out.println("Austria: "+solution.getCountries().get(3).getColor());
            System.out.println("Hungary: "+solution.getCountries().get(4).getColor());
//            System.out.println("UK: "+solution.getCountries().get(5).getColor());
        }

        System.out.println(solutions.size() + " solutions have been found");
    }
}
