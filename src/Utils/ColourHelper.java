package Utils;

public class ColourHelper {
    public static String getColourName(int colourNumber){
        switch (colourNumber){
            case 0:
                return "Unassigned";
            case 1:
                return "Red";
            case 2:
                return "Green";
            case 3:
                return "Blue";
            case 4:
                return "Yellow";
            default:
                return "Another colour - "+colourNumber;
        }
    }
}
