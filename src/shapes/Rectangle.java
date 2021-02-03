package shapes;

public class Rectangle {

    protected double length;
    protected double width;

    Rectangle(){

    }

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.width*this.length;
    }

    public double getPerimeter () {
        return this.width*2 + this.length*2;
    }
}
