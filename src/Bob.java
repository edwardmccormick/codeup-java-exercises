import java.util.Locale;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What would you like to say to Bob?");
        String response = sc.nextLine().trim().toLowerCase();
        while (!response.equals("goodbye")){
            if (response.endsWith("!")) {
                System.out.println("Woah, chill out!");
            } else if (response.endsWith("?")) {
                System.out.println("Sure");
            } else if (response.length() < 1) {
                System.out.println("Fine, be that way.");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("What would you like to say to Bob?");
            response = sc.nextLine().trim().toLowerCase();
        } ;
    }
}
