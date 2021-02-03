package shapes;

public class Square extends Rectangle {

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
    public double getArea() {
        return Math.pow(this.length, 2);
    }

    @Override
    public double getPerimeter() {
        return this.length*4;
    }

}
