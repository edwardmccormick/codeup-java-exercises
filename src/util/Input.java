package util;

import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);

    public String getString() {
        System.out.println("Please enter a string.");
        String input = scanner.nextLine();
        return input;
    }

    public boolean trueOrFalse() {
        System.out.println("Please enter either yes (for true) or no (for false)");
        String input = scanner.nextLine();
        return (input.equalsIgnoreCase("yes") | input.equalsIgnoreCase("y") | input.equalsIgnoreCase("true") | input.equalsIgnoreCase("t"));
    }
}
