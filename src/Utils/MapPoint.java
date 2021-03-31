package Utils;

import java.util.ArrayList;

public class MapPoint {
    private int posX;
    private int posY;

    public MapPoint(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public MapPoint getClosest(ArrayList<MapPoint> points){
        MapPoint closest = points.get(0);
        double smallestDistance = getDistance(closest);

        for (MapPoint point : points) {
            if(getDistance(point) < smallestDistance){
                closest = point;
                smallestDistance = getDistance(point);
            }
        }

        return closest;
    }

    public double getDistance(MapPoint anotherPoint){
        return Math.sqrt(Math.pow(posX - anotherPoint.getPosX(), 2)+Math.pow(posY - anotherPoint.getPosY(), 2));
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public String toString(){
        return (posX+":"+posY);
    }
}
