package shapes;

import java.util.Scanner;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Scanner in = new Scanner(System.in);
        System.out.println("What is the radius of your circle?");
        double input = in.nextDouble();
        circle.setRadius(input);
        System.out.println(input);
        System.out.println(circle.getRadius());
        System.out.printf("For a circle with radius %f the area is %f %n",circle.getRadius(), circle.getArea());
        System.out.printf("For a circle with radius %f the circumference is %f%n", circle.getRadius(), circle.getCircumference());

    }
}
