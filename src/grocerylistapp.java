import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class grocerylistapp {


    public static void main(String[] args) {
        HashMap<String, Integer> fresh = new HashMap<>();
        HashMap<String, Integer> meat = new HashMap<>();
        HashMap<String, Integer> dairy = new HashMap<>();
        HashMap<String, Integer> bakery = new HashMap<>();
        HashMap<String, Integer> dry = new HashMap<>();
        ArrayList<HashMap> categories = new ArrayList<>();
        categories.add(fresh);
        categories.add(meat);
        categories.add(dairy);
        categories.add(bakery);
        categories.add(dry);

        System.out.println("Would you like to create a grocery list?");
        Scanner in = new Scanner (System.in);
        String userinput = in.nextLine().trim();
        if (userinput.equalsIgnoreCase("yes") | userinput.equalsIgnoreCase("y") | userinput.equalsIgnoreCase("create")) {
            System.out.println("The following categories are available.");
            System.out.println(categories);
            userinput = in.nextLine().trim();
            while (!categories.contains(userinput.toLowerCase())) {
                System.out.println("I'm sorry, that didn't match any current category. Please try again or enter another cateogry.");
                userinput = in.nextLine().trim();
            }
            System.out.println("Entering a new item under " + userinput);
            System.out.print("What is the item? >");
            String item = in.nextLine().trim();
            System.out.print("How many would you like to add to your list? >");
            int number = in.nextInt();
            System.out.println("Would you like to add " + item + " with quantity " + number + " to list " + userinput + "? y/n");
            String confirm = in.nextLine();
            if (confirm.equalsIgnoreCase("yes") | confirm.equalsIgnoreCase("y")) {
                categories.get(categories.indexOf(userinput)).put(item, number);
                System.out.println("Success! Would you like to add more to " + userinput + " or pick a different category?");
            }
        }
    }
}