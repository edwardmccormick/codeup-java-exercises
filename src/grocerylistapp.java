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
        HashMap<String, HashMap> categories = new HashMap<>();
        categories.put("Produce",fresh);
        categories.put("Meat",meat);
        categories.put("Dairy",dairy);
        categories.put("Bakery",bakery);
        categories.put("Dry Groceries",dry);

        System.out.println("Would you like to create a grocery list?");
        Scanner in = new Scanner (System.in);
        String userinput = in.nextLine().trim();
        if (userinput.equalsIgnoreCase("yes") | userinput.equalsIgnoreCase("y") | userinput.equalsIgnoreCase("create")) {
            System.out.println("The following categories are available.");
            for (String key : categories.keySet())
            {System.out.printf("| %s ", key);}
            System.out.println("|");
            userinput = in.nextLine().trim();
            while (categories.get(userinput) == null) {
                System.out.println("I'm sorry, that didn't match any current category. Please try again or enter another category.");
                userinput = in.nextLine().trim();
            }
            do {System.out.println("Entering a new item under " + userinput);
            System.out.print("What is the item? >");
            String item = in.nextLine().trim();
            System.out.print("How many would you like to add to your list? >");
            int number = in.nextInt();
            System.out.println("Would you like to add " + item + " with quantity " + number + " to list " + userinput + "? y/n");
            in.nextLine();
            String confirm = in.nextLine();
            if (confirm.equalsIgnoreCase("yes") | confirm.equalsIgnoreCase("y")) {
                categories.get(userinput).put(item, number);
                System.out.println("Success! Would you like to add more to " + userinput + " or pick a different category? Hit enter for another, type \"return\" to return to the main menu.");
                if(in.nextLine().equalsIgnoreCase("return")) {break;};}
            else if (confirm.equalsIgnoreCase("return")) {break;}
            else {
                System.out.println("You may press enter to re-enter your item and amount, type \"yes\" to add " + item + " with quantity " + number + " to list " + userinput + ", or type \"return\" to return to the main menu.");


            }
            }
            }
        }
    }
}