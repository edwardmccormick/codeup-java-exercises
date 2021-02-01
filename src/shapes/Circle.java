package shapes;

public class Circle {
    private static double radius;

    public static double getRadius() {
        return radius;
    }

    public static void setRadius(double rad) {
        rad = radius;
    }

    public static double getArea() {
        return Math.PI*getRadius()*getRadius();
    }

    public static double getCircumference() {
        return Math.PI*2*getRadius();
    }

}
