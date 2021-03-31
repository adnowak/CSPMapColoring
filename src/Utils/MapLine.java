package Utils;

public class MapLine {
    private MapPoint point0;
    private MapPoint point1;

    public MapLine(MapPoint point0, MapPoint point1) {
        this.point0 = point0;
        this.point1 = point1;
    }

    //https://www.geeksforgeeks.org/program-for-point-of-intersection-of-two-lines/
    public boolean checkCrossing(MapLine another){
        double crossX;
        double crossY;
        boolean collisionDetected = false;

        double a1 = point1.getPosY() - point0.getPosY();
        double b1 = point0.getPosX() - point1.getPosX();
        double c1 = a1*(point0.getPosX()) + b1*(point0.getPosY());

        // Line CD represented as a2x + b2y = c2
        double a2 = another.getPoint1().getPosY() - another.getPoint0().getPosY();
        double b2 = another.getPoint0().getPosX() - another.getPoint1().getPosX();
        double c2 = a2*(another.getPoint0().getPosX())+ b2*(another.getPoint0().getPosY());

        double determinant = a1*b2 - a2*b1;

        if (determinant == 0)
        {
            // The lines are parallel. This is simplified
            // by returning a pair of FLT_MAX
            crossX = Double.MAX_VALUE;
            crossY = Double.MAX_VALUE;
        }
        else
        {
            crossX = (b2*c1 - b1*c2)/determinant;
            crossY = (a1*c2 - a2*c1)/determinant;
        }

        if(collisionDetected){
            if(crossX < another.getDimXLowerBorder() ||
                    crossX > another.getDimXHigherBorder() ||
                    crossY < another.getDimYLowerBorder()  ||
                    crossY > another.getDimYHigherBorder() ){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }

    public int getDimXLowerBorder(){
        if(point0.getPosX() < point1.getPosX()){
            return point0.getPosX();
        }
        else {
            return point1.getPosX();
        }
    }

    public int getDimXHigherBorder(){
        if(point0.getPosX() > point1.getPosX()){
            return point0.getPosX();
        }
        else {
            return point1.getPosX();
        }
    }

    public int getDimYLowerBorder(){
        if(point0.getPosY() < point1.getPosY()){
            return point0.getPosY();
        }
        else {
            return point1.getPosY();
        }
    }

    public int getDimYHigherBorder(){
        if(point0.getPosY() > point1.getPosY()){
            return point0.getPosY();
        }
        else {
            return point1.getPosY();
        }
    }

    public MapPoint getPoint0() {
        return point0;
    }

    public void setPoint0(MapPoint point0) {
        this.point0 = point0;
    }

    public MapPoint getPoint1() {
        return point1;
    }

    public void setPoint1(MapPoint point1) {
        this.point1 = point1;
    }
}
