import Algorithm.CSPSolver;
import Models.Country;
import Models.EinsteinProblem;
import Models.HouseConfiguration;
import Models.Map;
import Utils.ColourHelper;
import org.junit.Test;

import java.util.ArrayList;

public class CSPSolverTest {
    @Test
    public void testMapColoring(){
        //        new MapGenerator().generate(5);
        int domainSize = 4;

        Country poland = new Country(domainSize);
        Country czechia = new Country(domainSize);
        Country slovakia = new Country(domainSize);
        Country austria = new Country(domainSize);
        Country hungary = new Country(domainSize);
        Country france = new Country(domainSize);
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(poland);
        countries.add(czechia);
        countries.add(slovakia);
        countries.add(austria);
        countries.add(hungary);
//        countries.add(france);
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

        ArrayList<Map> solutions = new CSPSolver(map).getBacktrackSolutions();
        System.out.println("Poland as a starting country");
        for (Map solution: solutions) {
            System.out.println();
            System.out.println("Solution");
            System.out.println("Poland: "+ ColourHelper.getColourName(solution.getVariables().get(0).getValue()));
            System.out.println("Czechia: "+ColourHelper.getColourName(solution.getVariables().get(1).getValue()));
            System.out.println("Slovakia: "+ColourHelper.getColourName(solution.getVariables().get(2).getValue()));
            System.out.println("Austria: "+ColourHelper.getColourName(solution.getVariables().get(3).getValue()));
            System.out.println("Hungary: "+ColourHelper.getColourName(solution.getVariables().get(4).getValue()));
//            System.out.println("France: "+ColourHelper.getColourName(solution.getCountries().get(5).getColor()));
        }

        System.out.println(solutions.size() + " solutions have been found");
    }

    @Test
    public void testEinsteinProblem(){
        ArrayList<HouseConfiguration> houses = new ArrayList<>();
        EinsteinProblem problem = new EinsteinProblem(houses);

        HouseConfiguration first = new HouseConfiguration(0, problem);
        HouseConfiguration second = new HouseConfiguration(1, problem);
        HouseConfiguration third = new HouseConfiguration(2, problem);
        HouseConfiguration fourth = new HouseConfiguration(3, problem);
        HouseConfiguration fifth = new HouseConfiguration(4, problem);
        houses.add(first);
        houses.add(second);
        houses.add(third);
        houses.add(fourth);
        houses.add(fifth);

        first.addNeighbour(second);
        second.addNeighbour(first);
        second.addNeighbour(third);
        third.addNeighbour(second);
        third.addNeighbour(fourth);
        fourth.addNeighbour(third);
        fourth.addNeighbour(fifth);
        fifth.addNeighbour(fourth);

        first.addOtherHouse(second);
        first.addOtherHouse(third);
        first.addOtherHouse(fourth);
        first.addOtherHouse(fifth);

        second.addOtherHouse(first);
        second.addOtherHouse(third);
        second.addOtherHouse(fourth);
        second.addOtherHouse(fifth);

        third.addOtherHouse(first);
        third.addOtherHouse(second);
        third.addOtherHouse(fourth);
        third.addOtherHouse(fifth);

        fourth.addOtherHouse(first);
        fourth.addOtherHouse(second);
        fourth.addOtherHouse(third);
        fourth.addOtherHouse(fifth);

        fifth.addOtherHouse(first);
        fifth.addOtherHouse(second);
        fifth.addOtherHouse(third);
        fifth.addOtherHouse(fourth);

        ArrayList<EinsteinProblem> solutions = new CSPSolver(problem).getBacktrackSolutions();
        System.out.println("Solutions: ");
        for (EinsteinProblem solution: solutions) {
            System.out.println();
            System.out.println("First: "+solution.getVariables().get(0).getValue());
            System.out.println("Second: "+solution.getVariables().get(1).getValue());
            System.out.println("Third: "+solution.getVariables().get(2).getValue());
            System.out.println("Fourth: "+solution.getVariables().get(3).getValue());
            System.out.println("Fifth: "+solution.getVariables().get(4).getValue());
        }

        System.out.println(solutions.size()+" solutions found");
    }
}
