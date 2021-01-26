import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

        System.out.println(addition(4,5));
        System.out.println(subtraction(19,10));
        System.out.println(multiplication(4,4));
        System.out.println(division(9,81));
        System.out.println(modulus(-9));
        System.out.println(multiplicationNoStar(10,8));
        System.out.println(multiplicationRecursive(10,8));
        getInteger(10,1);
        System.out.println(factorial());
        diceRoll();

    }
    public static long addition(int x, int y) {
        return x + y;
    }
    public static long subtraction(int x, int y) {
        return x - y;
    }
    public static long multiplication(int x, int y) {
        return x*y;
    }
    public static long division(int divisor, int dividend) {
        return dividend/divisor;
    }
    public static long  modulus(int value) {
        if (value >= 0) {return value;} else {return -value;}
    }
    public static long multiplicationNoStar(int x, int y) {
        long result = 0;
        for (int i = 1; i<=y; i++) {result += x;}
        return result;
    }
    public static long multiplicationRecursive(int x, int y) {
//        long result = 0;
        if (y == 0) {return 0;}
        if (y == 1) {return x;}
        if (y ==2) {return x + x;}
        else {return x + multiplicationRecursive(x,y-1);}
    }

    public static int getInteger(int high, int low) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number between " + high + " and " + low);
        int input = in.nextInt();
        if (input > high | input < low) {System.out.println("Please select again, your choice was outside the range."); getInteger(high, low);}
        else {System.out.println("Thank you, your selection was within the range.");}
        return input;
    }
    public static long factorial() {
        long result = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 20");//20! is 2,432,902,008,176,640,000 - Java process 20! as -4249290049419214848 because it overflowed its memory container
        int input = in.nextInt();
        if (input > 21 | input < 1) {System.out.println("Please select again, your choice was outside the range."); factorial();}
        else {while (input > 1) {result = result * input;input--;}}
        return result;
    }
    public static void diceRoll() {
        Scanner in = new Scanner(System.in);
        Random dice1 = new Random();
        Random dice2 = new Random();
        System.out.println("How many sides would you like the dice you roll to have? (standard is six)");
        int input = in.nextInt();
        System.out.println("Hit enter to roll, type 'exit' to stop.");
        String cleaner = in.nextLine();
        if(in.nextLine().equalsIgnoreCase("exit")) {System.out.println("Stopped rolling.");}
        else {System.out.println("You rolled " + (dice1.nextInt(input-1)+1) + " and " + (dice2.nextInt(input-1) + 1) + " for your rolls.");}
        System.out.println("If you'd like to roll again, type 'Yes' and press enter, otherwise just press enter.");
//        cleaner = in.nextLine();
        if(in.nextLine().equalsIgnoreCase("yes")) {diceRoll();}

        }
}
