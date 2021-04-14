import Algorithm.CSPSolver;
import Models.*;
import Utils.ColourHelper;
import org.junit.Test;

import java.util.ArrayList;

public class MapCSPSolverTest {
    @Test
    public void testMapColoring2(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate2Nodes(), false, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring3(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate3Nodes(), false, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring4(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate4Nodes(), false, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring6(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate6Nodes(), false, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring8(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate8Nodes(), false, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring9(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate9Nodes(), false, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring10(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate10Nodes(), false, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring12(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate12Nodes(), false, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring14(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate14Nodes(), false, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring16(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate16Nodes(), false, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring16DefVal(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate16Nodes(), false, new RandomVariableHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring16DefVar(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate16Nodes(), false, new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring16DefVarVal(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate16Nodes(), false);
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring16MostConstrainedVar(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate16Nodes(), false, new MostConstrainedVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring16MostConstrainedVarDefVal(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate16Nodes(), false, new MostConstrainedVariableHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring2FC(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate2Nodes(), true, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring3FC(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate3Nodes(), true, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring4FC(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate4Nodes(), true, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring6FC(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate6Nodes(), true, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring8FC(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate8Nodes(), true, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring9FC(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate9Nodes(), true, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring10FC(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate10Nodes(), true, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring12FC(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate12Nodes(), true, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring14FC(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate14Nodes(), true, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring16FC(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate16Nodes(), true, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring16DefValFC(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate16Nodes(), true, new RandomVariableHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring16DefVarFC(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate16Nodes(), true, new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring16DefVarValFC(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate16Nodes(), true);
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring16MostConstrainedVarFC(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate16Nodes(), true, new MostConstrainedVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testMapColoring16MostConstrainedVarDefValFC(){
        CSPSolver<Map> solver = new CSPSolver<Map>(initiate16Nodes(), true, new MostConstrainedVariableHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    private void printResults(ArrayList<Map> solutions){
//        for (Map solution: solutions) {
//            System.out.println();
//            System.out.println("Solution");
//            System.out.println("Poland: "+ ColourHelper.getColourName(solution.getVariables().get(0).getValue()));
//            System.out.println("Czechia: "+ColourHelper.getColourName(solution.getVariables().get(1).getValue()));
//            System.out.println("Slovakia: "+ColourHelper.getColourName(solution.getVariables().get(2).getValue()));
//            System.out.println("Austria: "+ColourHelper.getColourName(solution.getVariables().get(3).getValue()));
//            System.out.println("Hungary: "+ColourHelper.getColourName(solution.getVariables().get(4).getValue()));
//            System.out.println("France: "+ColourHelper.getColourName(solution.getCountries().get(5).getColor()));
//        }

        System.out.println("First found solution:");
        for (Variable variable: solutions.get(0).getVariables()) {
            System.out.println(variable.getValue());
        }

        System.out.println(solutions.size() + " solution(s) found");
    }

    private Map initiate2Nodes(){
        int domainSize = 4;

        Country poland = new Country(domainSize);
        Country czechia = new Country(domainSize);

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(poland);
        countries.add(czechia);

        poland.addNeighbour(czechia);
        czechia.addNeighbour(poland);

        return new Map(countries);
    }

    private Map initiate3Nodes(){
        int domainSize = 4;

        Country poland = new Country(domainSize);
        Country czechia = new Country(domainSize);
        Country slovakia = new Country(domainSize);

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(poland);
        countries.add(czechia);
        countries.add(slovakia);

        poland.addNeighbour(czechia);
        poland.addNeighbour(slovakia);
        czechia.addNeighbour(poland);
        czechia.addNeighbour(slovakia);
        slovakia.addNeighbour(poland);
        slovakia.addNeighbour(czechia);

        return new Map(countries);
    }

    private Map initiate4Nodes(){
        int domainSize = 4;

        Country poland = new Country(domainSize);
        Country czechia = new Country(domainSize);
        Country slovakia = new Country(domainSize);
        Country austria = new Country(domainSize);

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(poland);
        countries.add(czechia);
        countries.add(slovakia);
        countries.add(austria);

        poland.addNeighbour(czechia);
        poland.addNeighbour(slovakia);
        czechia.addNeighbour(poland);
        czechia.addNeighbour(slovakia);
        czechia.addNeighbour(austria);
        slovakia.addNeighbour(poland);
        slovakia.addNeighbour(czechia);
        slovakia.addNeighbour(austria);
        austria.addNeighbour(czechia);
        austria.addNeighbour(slovakia);

        return new Map(countries);
    }

    private Map initiate6Nodes(){
        int domainSize = 4;

        Country poland = new Country(domainSize);
        Country czechia = new Country(domainSize);
        Country slovakia = new Country(domainSize);
        Country austria = new Country(domainSize);
        Country hungary = new Country(domainSize);
        Country germany = new Country(domainSize);

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(poland);
        countries.add(czechia);
        countries.add(slovakia);
        countries.add(austria);
        countries.add(hungary);
        countries.add(germany);

        poland.addNeighbour(czechia);
        poland.addNeighbour(slovakia);
        poland.addNeighbour(germany);
        czechia.addNeighbour(poland);
        czechia.addNeighbour(slovakia);
        czechia.addNeighbour(austria);
        czechia.addNeighbour(germany);
        slovakia.addNeighbour(poland);
        slovakia.addNeighbour(czechia);
        slovakia.addNeighbour(austria);
        slovakia.addNeighbour(hungary);
        austria.addNeighbour(czechia);
        austria.addNeighbour(slovakia);
        austria.addNeighbour(germany);
        austria.addNeighbour(hungary);
        germany.addNeighbour(poland);
        germany.addNeighbour(czechia);
        germany.addNeighbour(austria);
        hungary.addNeighbour(slovakia);
        hungary.addNeighbour(austria);

        return new Map(countries);
    }

    private Map initiate8Nodes(){
        int domainSize = 4;

        Country poland = new Country(domainSize);
        Country czechia = new Country(domainSize);
        Country slovakia = new Country(domainSize);
        Country austria = new Country(domainSize);
        Country hungary = new Country(domainSize);
        Country germany = new Country(domainSize);
        Country netherlands = new Country(domainSize);
        Country switzerland = new Country(domainSize);

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(poland);
        countries.add(czechia);
        countries.add(slovakia);
        countries.add(austria);
        countries.add(hungary);
        countries.add(germany);
        countries.add(netherlands);
        countries.add(switzerland);

        poland.addNeighbour(czechia);
        poland.addNeighbour(slovakia);
        poland.addNeighbour(germany);
        czechia.addNeighbour(poland);
        czechia.addNeighbour(slovakia);
        czechia.addNeighbour(austria);
        czechia.addNeighbour(germany);
        slovakia.addNeighbour(poland);
        slovakia.addNeighbour(czechia);
        slovakia.addNeighbour(austria);
        slovakia.addNeighbour(hungary);
        austria.addNeighbour(czechia);
        austria.addNeighbour(slovakia);
        austria.addNeighbour(germany);
        austria.addNeighbour(hungary);
        austria.addNeighbour(switzerland);
        germany.addNeighbour(poland);
        germany.addNeighbour(czechia);
        germany.addNeighbour(austria);
        germany.addNeighbour(netherlands);
        germany.addNeighbour(switzerland);
        netherlands.addNeighbour(germany);
        switzerland.addNeighbour(germany);
        switzerland.addNeighbour(austria);
        hungary.addNeighbour(slovakia);
        hungary.addNeighbour(austria);

        return new Map(countries);
    }

    private Map initiate9Nodes(){
        int domainSize = 4;

        Country poland = new Country(domainSize);
        Country czechia = new Country(domainSize);
        Country slovakia = new Country(domainSize);
        Country austria = new Country(domainSize);
        Country hungary = new Country(domainSize);
        Country germany = new Country(domainSize);
        Country netherlands = new Country(domainSize);
        Country switzerland = new Country(domainSize);
        Country liechtenstein = new Country(domainSize);

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(poland);
        countries.add(czechia);
        countries.add(slovakia);
        countries.add(austria);
        countries.add(hungary);
        countries.add(germany);
        countries.add(netherlands);
        countries.add(switzerland);
        countries.add(liechtenstein);

        poland.addNeighbour(czechia);
        poland.addNeighbour(slovakia);
        poland.addNeighbour(germany);
        czechia.addNeighbour(poland);
        czechia.addNeighbour(slovakia);
        czechia.addNeighbour(austria);
        czechia.addNeighbour(germany);
        slovakia.addNeighbour(poland);
        slovakia.addNeighbour(czechia);
        slovakia.addNeighbour(austria);
        slovakia.addNeighbour(hungary);
        austria.addNeighbour(czechia);
        austria.addNeighbour(slovakia);
        austria.addNeighbour(germany);
        austria.addNeighbour(hungary);
        austria.addNeighbour(switzerland);
        austria.addNeighbour(liechtenstein);
        germany.addNeighbour(poland);
        germany.addNeighbour(czechia);
        germany.addNeighbour(austria);
        germany.addNeighbour(netherlands);
        germany.addNeighbour(switzerland);
        netherlands.addNeighbour(germany);
        switzerland.addNeighbour(germany);
        switzerland.addNeighbour(austria);
        switzerland.addNeighbour(liechtenstein);
        liechtenstein.addNeighbour(switzerland);
        liechtenstein.addNeighbour(austria);
        hungary.addNeighbour(slovakia);
        hungary.addNeighbour(austria);

        return new Map(countries);
    }

    private Map initiate10Nodes(){
        int domainSize = 4;

        Country poland = new Country(domainSize);
        Country czechia = new Country(domainSize);
        Country slovakia = new Country(domainSize);
        Country austria = new Country(domainSize);
        Country hungary = new Country(domainSize);
        Country germany = new Country(domainSize);
        Country netherlands = new Country(domainSize);
        Country switzerland = new Country(domainSize);
        Country liechtenstein = new Country(domainSize);
        Country italy = new Country(domainSize);

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(poland);
        countries.add(czechia);
        countries.add(slovakia);
        countries.add(austria);
        countries.add(hungary);
        countries.add(germany);
        countries.add(netherlands);
        countries.add(switzerland);
        countries.add(liechtenstein);
        countries.add(italy);

        poland.addNeighbour(czechia);
        poland.addNeighbour(slovakia);
        poland.addNeighbour(germany);
        czechia.addNeighbour(poland);
        czechia.addNeighbour(slovakia);
        czechia.addNeighbour(austria);
        czechia.addNeighbour(germany);
        slovakia.addNeighbour(poland);
        slovakia.addNeighbour(czechia);
        slovakia.addNeighbour(austria);
        slovakia.addNeighbour(hungary);
        austria.addNeighbour(czechia);
        austria.addNeighbour(slovakia);
        austria.addNeighbour(germany);
        austria.addNeighbour(hungary);
        austria.addNeighbour(switzerland);
        austria.addNeighbour(liechtenstein);
        austria.addNeighbour(italy);
        germany.addNeighbour(poland);
        germany.addNeighbour(czechia);
        germany.addNeighbour(austria);
        germany.addNeighbour(netherlands);
        germany.addNeighbour(switzerland);
        netherlands.addNeighbour(germany);
        switzerland.addNeighbour(germany);
        switzerland.addNeighbour(austria);
        switzerland.addNeighbour(liechtenstein);
        switzerland.addNeighbour(italy);
        liechtenstein.addNeighbour(switzerland);
        liechtenstein.addNeighbour(austria);
        italy.addNeighbour(austria);
        italy.addNeighbour(switzerland);
        hungary.addNeighbour(slovakia);
        hungary.addNeighbour(austria);

        return new Map(countries);
    }

    private Map initiate12Nodes(){
        int domainSize = 4;

        Country poland = new Country(domainSize);
        Country czechia = new Country(domainSize);
        Country slovakia = new Country(domainSize);
        Country austria = new Country(domainSize);
        Country hungary = new Country(domainSize);
        Country germany = new Country(domainSize);
        Country netherlands = new Country(domainSize);
        Country switzerland = new Country(domainSize);
        Country liechtenstein = new Country(domainSize);
        Country italy = new Country(domainSize);
        Country belgium = new Country(domainSize);
        Country france = new Country(domainSize);

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(poland);
        countries.add(czechia);
        countries.add(slovakia);
        countries.add(austria);
        countries.add(hungary);
        countries.add(germany);
        countries.add(netherlands);
        countries.add(switzerland);
        countries.add(liechtenstein);
        countries.add(italy);
        countries.add(belgium);

        poland.addNeighbour(czechia);
        poland.addNeighbour(slovakia);
        poland.addNeighbour(germany);
        czechia.addNeighbour(poland);
        czechia.addNeighbour(slovakia);
        czechia.addNeighbour(austria);
        czechia.addNeighbour(germany);
        slovakia.addNeighbour(poland);
        slovakia.addNeighbour(czechia);
        slovakia.addNeighbour(austria);
        slovakia.addNeighbour(hungary);
        austria.addNeighbour(czechia);
        austria.addNeighbour(slovakia);
        austria.addNeighbour(germany);
        austria.addNeighbour(hungary);
        austria.addNeighbour(switzerland);
        austria.addNeighbour(liechtenstein);
        austria.addNeighbour(italy);
        germany.addNeighbour(poland);
        germany.addNeighbour(czechia);
        germany.addNeighbour(austria);
        germany.addNeighbour(netherlands);
        germany.addNeighbour(switzerland);
        germany.addNeighbour(belgium);
        germany.addNeighbour(france);
        netherlands.addNeighbour(germany);
        netherlands.addNeighbour(belgium);
        switzerland.addNeighbour(germany);
        switzerland.addNeighbour(austria);
        switzerland.addNeighbour(liechtenstein);
        switzerland.addNeighbour(italy);
        switzerland.addNeighbour(france);
        liechtenstein.addNeighbour(switzerland);
        liechtenstein.addNeighbour(austria);
        italy.addNeighbour(austria);
        italy.addNeighbour(switzerland);
        italy.addNeighbour(france);
        belgium.addNeighbour(germany);
        belgium.addNeighbour(france);
        france.addNeighbour(belgium);
        france.addNeighbour(germany);
        france.addNeighbour(switzerland);
        france.addNeighbour(italy);
        hungary.addNeighbour(slovakia);
        hungary.addNeighbour(austria);

        return new Map(countries);
    }

    private Map initiate14Nodes(){
        int domainSize = 4;

        Country poland = new Country(domainSize);
        Country czechia = new Country(domainSize);
        Country slovakia = new Country(domainSize);
        Country austria = new Country(domainSize);
        Country hungary = new Country(domainSize);
        Country germany = new Country(domainSize);
        Country netherlands = new Country(domainSize);
        Country switzerland = new Country(domainSize);
        Country liechtenstein = new Country(domainSize);
        Country italy = new Country(domainSize);
        Country belgium = new Country(domainSize);
        Country france = new Country(domainSize);
        Country luxembourg = new Country(domainSize);
        Country slovenia = new Country(domainSize);

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(poland);
        countries.add(czechia);
        countries.add(slovakia);
        countries.add(austria);
        countries.add(hungary);
        countries.add(germany);
        countries.add(netherlands);
        countries.add(switzerland);
        countries.add(liechtenstein);
        countries.add(italy);
        countries.add(belgium);
        countries.add(luxembourg);
        countries.add(slovenia);

        poland.addNeighbour(czechia);
        poland.addNeighbour(slovakia);
        poland.addNeighbour(germany);
        czechia.addNeighbour(poland);
        czechia.addNeighbour(slovakia);
        czechia.addNeighbour(austria);
        czechia.addNeighbour(germany);
        slovakia.addNeighbour(poland);
        slovakia.addNeighbour(czechia);
        slovakia.addNeighbour(austria);
        slovakia.addNeighbour(hungary);
        austria.addNeighbour(czechia);
        austria.addNeighbour(slovakia);
        austria.addNeighbour(germany);
        austria.addNeighbour(hungary);
        austria.addNeighbour(switzerland);
        austria.addNeighbour(liechtenstein);
        austria.addNeighbour(italy);
        austria.addNeighbour(slovenia);
        germany.addNeighbour(poland);
        germany.addNeighbour(czechia);
        germany.addNeighbour(austria);
        germany.addNeighbour(netherlands);
        germany.addNeighbour(switzerland);
        germany.addNeighbour(belgium);
        germany.addNeighbour(france);
        germany.addNeighbour(luxembourg);
        netherlands.addNeighbour(germany);
        netherlands.addNeighbour(belgium);
        switzerland.addNeighbour(germany);
        switzerland.addNeighbour(austria);
        switzerland.addNeighbour(liechtenstein);
        switzerland.addNeighbour(italy);
        switzerland.addNeighbour(france);
        liechtenstein.addNeighbour(switzerland);
        liechtenstein.addNeighbour(austria);
        italy.addNeighbour(austria);
        italy.addNeighbour(switzerland);
        italy.addNeighbour(france);
        italy.addNeighbour(slovenia);
        belgium.addNeighbour(germany);
        belgium.addNeighbour(france);
        belgium.addNeighbour(luxembourg);
        france.addNeighbour(belgium);
        france.addNeighbour(germany);
        france.addNeighbour(switzerland);
        france.addNeighbour(italy);
        france.addNeighbour(luxembourg);
        hungary.addNeighbour(slovakia);
        hungary.addNeighbour(austria);
        hungary.addNeighbour(slovenia);
        slovenia.addNeighbour(italy);
        slovenia.addNeighbour(austria);
        slovenia.addNeighbour(hungary);

        return new Map(countries);
    }

    private Map initiate16Nodes(){
        int domainSize = 4;

        Country poland = new Country(domainSize);
        Country czechia = new Country(domainSize);
        Country slovakia = new Country(domainSize);
        Country austria = new Country(domainSize);
        Country hungary = new Country(domainSize);
        Country germany = new Country(domainSize);
        Country netherlands = new Country(domainSize);
        Country switzerland = new Country(domainSize);
        Country liechtenstein = new Country(domainSize);
        Country italy = new Country(domainSize);
        Country belgium = new Country(domainSize);
        Country france = new Country(domainSize);
        Country luxembourg = new Country(domainSize);
        Country slovenia = new Country(domainSize);
        Country serbia = new Country(domainSize);
        Country croatia = new Country(domainSize);

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(poland);
        countries.add(czechia);
        countries.add(slovakia);
        countries.add(austria);
        countries.add(hungary);
        countries.add(germany);
        countries.add(netherlands);
        countries.add(switzerland);
        countries.add(liechtenstein);
        countries.add(italy);
        countries.add(belgium);
        countries.add(luxembourg);
        countries.add(slovenia);
        countries.add(serbia);
        countries.add(croatia);

        poland.addNeighbour(czechia);
        poland.addNeighbour(slovakia);
        poland.addNeighbour(germany);
        czechia.addNeighbour(poland);
        czechia.addNeighbour(slovakia);
        czechia.addNeighbour(austria);
        czechia.addNeighbour(germany);
        slovakia.addNeighbour(poland);
        slovakia.addNeighbour(czechia);
        slovakia.addNeighbour(austria);
        slovakia.addNeighbour(hungary);
        austria.addNeighbour(czechia);
        austria.addNeighbour(slovakia);
        austria.addNeighbour(germany);
        austria.addNeighbour(hungary);
        austria.addNeighbour(switzerland);
        austria.addNeighbour(liechtenstein);
        austria.addNeighbour(italy);
        austria.addNeighbour(slovenia);
        germany.addNeighbour(poland);
        germany.addNeighbour(czechia);
        germany.addNeighbour(austria);
        germany.addNeighbour(netherlands);
        germany.addNeighbour(switzerland);
        germany.addNeighbour(belgium);
        germany.addNeighbour(france);
        germany.addNeighbour(luxembourg);
        netherlands.addNeighbour(germany);
        netherlands.addNeighbour(belgium);
        switzerland.addNeighbour(germany);
        switzerland.addNeighbour(austria);
        switzerland.addNeighbour(liechtenstein);
        switzerland.addNeighbour(italy);
        switzerland.addNeighbour(france);
        liechtenstein.addNeighbour(switzerland);
        liechtenstein.addNeighbour(austria);
        italy.addNeighbour(austria);
        italy.addNeighbour(switzerland);
        italy.addNeighbour(france);
        italy.addNeighbour(slovenia);
        belgium.addNeighbour(germany);
        belgium.addNeighbour(france);
        belgium.addNeighbour(luxembourg);
        france.addNeighbour(belgium);
        france.addNeighbour(germany);
        france.addNeighbour(switzerland);
        france.addNeighbour(italy);
        france.addNeighbour(luxembourg);
        hungary.addNeighbour(slovakia);
        hungary.addNeighbour(austria);
        hungary.addNeighbour(slovenia);
        hungary.addNeighbour(serbia);
        hungary.addNeighbour(croatia);
        slovenia.addNeighbour(italy);
        slovenia.addNeighbour(austria);
        slovenia.addNeighbour(hungary);
        slovenia.addNeighbour(croatia);
        serbia.addNeighbour(hungary);
        serbia.addNeighbour(croatia);

        return new Map(countries);
    }

    private Map initiateProblem(){
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

        return new Map(countries);
    }
}
