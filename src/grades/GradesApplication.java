package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {


        HashMap<String, Student> students = new HashMap<>();
        Student ted = new Student("Ted");
        ted.addGrade(95);
        ted.addGrade(88);
        ted.addGrade(60);
        ted.addGrade(75);
        Student josh = new Student("Josh");
        josh.addGrade(95);
        josh.addGrade(99);
        josh.addGrade(88);
        josh.addGrade(94);
        Student jimmie = new Student("Jimmie");
        jimmie.addGrade(89);
        jimmie.addGrade(97);
        jimmie.addGrade(93);
        jimmie.addGrade(87);
        Student casey = new Student("Casey");
        casey.addGrade(100);
        casey.addGrade(101);
        casey.addGrade(98);
        casey.addGrade(99);
        students.put("edwardmccormick",ted);
        students.put("talltree4prez",josh);
        students.put("jimmiesnowbunny", jimmie);
        students.put("fridaynext", casey);

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome!");
        do { System.out.println("\nHere are the GitHub usernames of our students: \n");
        System.out.println(students.keySet());
        System.out.printf("Which student would you like to see more about? \n >");
        String userinput = in.nextLine().trim();

        if (students.get(userinput) == null) {
            System.out.printf("I'm sorry, that didn't match any student, please enter another username. \n >");
        }
        else {
            System.out.printf("Name: %s - GitHub Username: %s\n", students.get(userinput).getName(), userinput);
            System.out.printf("Current Average: %.2f\n", students.get(userinput).getGradeAverage());
            System.out.println("This students grades are: " + students.get(userinput).getGrades());
            System.out.printf("Would you like to see another student? Enter for another or type \"no\" to exit. \n >");
            userinput = in.nextLine().trim();
            if (userinput.equalsIgnoreCase("no")) {break;}
        }
        } while (true);
        System.out.println("Thank you, goodbye.");
    }
}
