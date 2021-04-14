import Algorithm.CSPSolver;
import Models.*;
import Utils.ColourHelper;
import org.junit.Test;

import java.util.ArrayList;

public class EinsteinCSPSolverTest {
    @Test
    public void testEinsteinProblem(){
        CSPSolver<EinsteinProblem> solver = new CSPSolver<EinsteinProblem>(initiateProblem(), false, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testEinsteinProblemDefVal(){
        CSPSolver<EinsteinProblem> solver = new CSPSolver<EinsteinProblem>(initiateProblem(), false, new RandomVariableHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testEinsteinProblemDefVar(){
        CSPSolver<EinsteinProblem> solver = new CSPSolver<EinsteinProblem>(initiateProblem(), false, new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testEinsteinProblemDefVarVal(){
        CSPSolver<EinsteinProblem> solver = new CSPSolver<EinsteinProblem>(initiateProblem(), false);
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testEinsteinProblemMostConstrainedVar(){
        CSPSolver<EinsteinProblem> solver = new CSPSolver<EinsteinProblem>(initiateProblem(), false, new MostConstrainedVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testEinsteinProblemMostConstrainedVarDefVal(){
        CSPSolver<EinsteinProblem> solver = new CSPSolver<EinsteinProblem>(initiateProblem(), false, new RandomVariableHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testEinsteinProblemFC(){
        CSPSolver<EinsteinProblem> solver = new CSPSolver<EinsteinProblem>(initiateProblem(), true, new RandomVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testEinsteinProblemDefValFC(){
        CSPSolver<EinsteinProblem> solver = new CSPSolver<EinsteinProblem>(initiateProblem(), true, new RandomVariableHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testEinsteinProblemDefVarFC(){
        CSPSolver<EinsteinProblem> solver = new CSPSolver<EinsteinProblem>(initiateProblem(), true, new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testEinsteinProblemDefVarValFC(){
        CSPSolver<EinsteinProblem> solver = new CSPSolver<EinsteinProblem>(initiateProblem(), true);
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testEinsteinProblemMostConstrainedVarFC(){
        CSPSolver<EinsteinProblem> solver = new CSPSolver<EinsteinProblem>(initiateProblem(), true, new MostConstrainedVariableHeuristic(), new RandomValueHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    @Test
    public void testEinsteinProblemMostConstrainedVarDefValFC(){
        CSPSolver<EinsteinProblem> solver = new CSPSolver<EinsteinProblem>(initiateProblem(), true, new RandomVariableHeuristic());
        printResults(solver.getBacktrackSolutions());
        System.out.println(solver.getVisitedNodes() + " nodes visited");
    }

    private void printResults(ArrayList<EinsteinProblem> solutions){
        System.out.println("Solutions: ");
        for (EinsteinProblem solution: solutions) {
            for (HouseConfiguration house: solution.getVariables()) {
                if(house.getAnimal()==3){
                    System.out.println("Fish are kept in house nr: "+(house.getHouseIndex()+1));
                }
            }
        }

        System.out.println(solutions.size()+" solution(s) found");
    }

    private EinsteinProblem initiateProblem(){
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

        return problem;
    }
}
