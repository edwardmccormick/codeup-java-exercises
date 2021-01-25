import java.util.Locale;
import java.util.Scanner;

public class strings_lec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String firstName = "Fer";
//        int age = 30;
//        System.out.println("What's your name?");
//        firstName = sc.nextLine();
//
//        System.out.println("Your name is : " + firstName);
//
//        if(firstName.equals("Fer")){System.out.println("firstName is Fer");}
//        else {System.out.println("firstName is not Fer");}
//
//        if(firstName == "Fer"){System.out.println("This threw a TRUE return that firstName == Fer");} else{
//            System.out.println("This threw a FALSE return that firstName == Fer");
//        };

        System.out.println("What's your email?");
        String email = sc.nextLine().toLowerCase().trim();

        System.out.println("index of @ :" + email.indexOf("@"));

        System.out.println("char at " + email.charAt(13));

        if(email.equalsIgnoreCase("ted.mccormick@gmail.com")){System.out.println("That is correct");} else{System.out.println("ERROR ERROR C:\\ BEING DELETED!");}

        if(email.endsWith("gmail.com")){System.out.println("You are at the right login.");} else {System.out.println("You are in the wrong domain.");}
//        for(int x = 0; x < email.length(); x++){System.out.println("email.charaAt(x) = " + email.charAt(x));};


    }
}
