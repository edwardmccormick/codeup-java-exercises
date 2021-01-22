import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        String string1;
        String string2;
        String string3;
        String sentence1;
        System.out.printf("The value of pi is approximately %.2f%n", pi);
        int integer1;
        int integer2;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer");
        integer1 = in.nextInt();
        System.out.println("Here is what you entered: ");
        System.out.println(integer1);

        System.out.println("Enter three words, separated by either spaces or returns:");
        string1 = in.next();
        string2 = in.next();
        string3 = in.next();

        System.out.println("The words you entered were: word 1:");
        System.out.println(string1 + ", word 2:" + string2 + ", word 3: " + string3 + ".");

        System.out.println("Enter a sentence, please:");
        sentence1 = in.nextLine();
        System.out.println("The sentence you entered was: " + sentence1 + ".");

        System.out.println("Enter the length and width dimensions of the classroom.");
        integer1 = in.nextInt();
        integer2 = in.nextInt();
        System.out.println("The total are of the classroom is: " + (integer1 * integer2));

    }
}
