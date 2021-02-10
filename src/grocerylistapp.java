import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class grocerylistapp {


    public static void main(String[] args) {
        HashMap<String, Integer> fresh = new HashMap<>();
        HashMap<String, Integer> meat = new HashMap<>();
        HashMap<String, Integer> dairy = new HashMap<>();
        HashMap<String, Integer> bakery = new HashMap<>();
        HashMap<String, Integer> dry = new HashMap<>();
        HashMap<String, HashMap> categories = new HashMap<>();
        categories.put("produce",fresh);
        categories.put("meat",meat);
        categories.put("dairy",dairy);
        categories.put("bakery",bakery);
        categories.put("dry groceries",dry);
        int count = 0;
        System.out.println("Would you like to create a grocery list?");
        Scanner in = new Scanner (System.in);
        String userinput = in.nextLine().trim().toLowerCase();
        if (userinput.equalsIgnoreCase("yes") | userinput.equalsIgnoreCase("y") | userinput.equalsIgnoreCase("create")) {
            while (true) {
                System.out.println("The following categories are available.");
                for (String key : categories.keySet()) {
                    System.out.printf("| %s ", key);
                }
                System.out.println("|");
                if (count > 0) {
                    System.out.println("You can also finalize your list: type \"finalize\" to do so.");}
                    userinput = in.nextLine().trim();
                while (categories.get(userinput) == null & !userinput.equalsIgnoreCase("finalize") & !userinput.equalsIgnoreCase("final")) {
                    System.out.println("I'm sorry, that didn't match any current category. Please try again or enter another category.");
                    userinput = in.nextLine().trim();
                }
                if (categories.get(userinput) != null) {
                do {count++;
                    System.out.println("Entering a new item under " + userinput);
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
                        if (in.nextLine().equalsIgnoreCase("return")) {
                            break;
                        }
                        ;
                    } else if (confirm.equalsIgnoreCase("return")) {
                        break;
                    } else {
                        System.out.println("You may press enter to re-enter your item and amount, type \"yes\" to add " + item + " with quantity " + number + " to list " + userinput + ", or type \"return\" to return to the main menu.");


                    }
                } while (true);}
                else if (userinput.equalsIgnoreCase("finalize") | userinput.equalsIgnoreCase("final")) {
                    ArrayList catToAlphabatize = new ArrayList();
                    for (int i = 0; i < categories.keySet().toArray().length; i++) {
                        catToAlphabatize.add(categories.keySet().toArray()[i]);
                    }
                    Collections.sort(catToAlphabatize);
                    for (int i = 0 ; i < catToAlphabatize.size(); i++) {
                        if (categories.get(catToAlphabatize.get(i)).keySet().toArray().length == 0) {
//                            System.out.println("No items of category: " + catToAlphabatize.get(i));
                        } else {
                    System.out.println("-" + catToAlphabatize.get(i));
                    ArrayList alphabetizer = new ArrayList();
                    for (int ii = 0; ii < categories.get(catToAlphabatize.get(i)).keySet().toArray().length; ii++)
                    {alphabetizer.add(categories.get(catToAlphabatize.get(i)).keySet().toArray()[ii]);};
                    Collections.sort(alphabetizer);
                    for (int iii = 0 ; iii < alphabetizer.size(); iii++) {
                        System.out.printf("%15s qty %d\n", alphabetizer.get(iii), categories.get(catToAlphabatize.get(i)).get(alphabetizer.get(iii)));
                    }}}
                    break;

//                    System.out.println(Arrays.sort(keyArray));
//                for (String key : categories.keySet().toArray())
                }
            }
            }
        }
    }
