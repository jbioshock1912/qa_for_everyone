package codewars;

public class FeastOfManyBeasts {
    public static boolean feast(String beast, String dish) {
        boolean result = false;
        if (beast.substring(0, 1).equals(dish.substring(0, 1)) &&
                (beast.substring(beast.length() - 1).equals(dish.substring(dish.length() - 1)))) {
            result = true;
        }
        return result;
    }
}



