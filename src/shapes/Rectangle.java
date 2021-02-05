package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

Rectangle (double length, double width) {
    super(length,width);
}


    @Override
    public double getArea() {
        return this.length*this.width;
    }

    @Override
    public double getPerimeter() {
        return this.length*2 + this.width*2;
    }

    public void setLength(double length) {
        this.length = length;
    }



    public void setWidth(double width) {
        this.width = width;
    }

}
