package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public double getLength() {
        return length;
    }

    abstract public void setLength(double length);

    public double getWidth() {
        return width;
    }

    abstract public void setWidth(double width);

    Quadrilateral (double length, double width) {
        this.length = length;
        this.width = width;
    }

}
