package shapes;

public class Square extends Quadrilateral implements Measurable{

//    Square (double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
    Square (double lengthSide) {
//        this.length = lengthSide;
//        this.width = lengthSide;
        super(lengthSide,lengthSide);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public double getArea() {
        return Math.pow(this.length, 2);
    }

    @Override
    public double getPerimeter() {
        return this.length*4;
    }

}
