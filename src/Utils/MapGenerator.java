package Utils;

import Models.Map;
import Models.Country;

import java.util.ArrayList;
import java.util.Collections;

public class MapGenerator {
    private int mapSizeX = 10;
    private int mapSizeY = 10;
    private int coloursAmount = 3;

    public Map generate(int amount){
        if(amount > mapSizeX*mapSizeY) throw new IndexOutOfBoundsException();

        ArrayList<Country> countries = new ArrayList<>();
        for(int i=0; i<amount; i++){
            countries.add(new Country(coloursAmount));
        }

        ArrayList<Integer> baseList = new ArrayList<>();
        for(int i=0; i<mapSizeX*mapSizeY; i++){
            baseList.add(i);
        }
        Collections.shuffle(baseList);

        ArrayList<MapPoint> points = new ArrayList<>();
        for(int i=0; i<amount; i++){
            points.add(new MapPoint(baseList.get(i)/mapSizeY, baseList.get(i)%mapSizeY));
            System.out.println(points.get(i));
        }

        System.out.println();

        for (MapPoint point : points) {
            ArrayList<MapPoint> neighbours = new ArrayList<>();
            neighbours.addAll(points);
            neighbours.remove(point);
            System.out.println(point.getClosest(neighbours));
        }



        for (Country country: countries) {
            System.out.println(country.checkConstraintSatisfied());
            System.out.println(country.checkConstraintSatisfiedWithValue(1));
        }

        return new Map(countries);
    }
}
