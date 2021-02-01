package shapes;

import java.util.Scanner;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Scanner in = new Scanner(System.in);
        System.out.println("What is the radius of your circle?");
        circle1.setRadius(in.nextDouble());
        System.out.printf("For a circle with radius %f the area is %f %n",circle1.getRadius(), circle1.getArea());
        System.out.printf("For a circle with radius %f the circumference is %f%n", circle1.getRadius(), circle1.getCircumference());

    }
}
