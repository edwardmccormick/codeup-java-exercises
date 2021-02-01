package shapes;

public class Circle {
    private double radius;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double inputRadius) {this.radius = inputRadius;}

    public double getArea() {
        return Math.PI*getRadius()*getRadius();
    }

    public double getCircumference() {
        return Math.PI*2*getRadius();
    }

}
