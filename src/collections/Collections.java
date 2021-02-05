package collections;

import java.util.ArrayList;

import java.util.HashMap;

public class Collections {

        public static void main(String[] args) {

            // *************************************************** //
            // ********* ArrayList and its Methods *************** //
            // *************************************************** //

            // 1. Initialize an ArrayList of Strings, called roasts
            //   add light, medium, medium, dark to the array list, one at a time

            ArrayList<String> roasts = new ArrayList<>();
            roasts.add("light");
            roasts.add("medium");
            roasts.add("medium");
            roasts.add("dark");

            System.out.println(roasts);
            // 2. Check to see if the list contains "dark" , and then "espresso"

            System.out.println(roasts.contains("dark"));

            System.out.println("roasts.contains(\"espresso\") = " + roasts.contains("espresso"));

            // 3. Find the last index of "medium" in the array

            System.out.println("roasts.lastIndexOf(\"medium\") = " + roasts.lastIndexOf("medium"));

            // 4. Check if the array list is empty

            ArrayList<String> coffees = new ArrayList<>();

            System.out.println("roasts.isEmpty() = " + roasts.isEmpty());
            System.out.println("coffees.isEmpty() = " + coffees.isEmpty());

            // 5. Assign the array list an empty ArrayList object, and then check if empty

            System.out.println("roasts.isEmpty() = " + roasts.isEmpty());
            System.out.println("coffees.isEmpty() = " + coffees.isEmpty());

            // 6. Remove the espresso roast

            roasts.add("light");
            roasts.add("espresso");

            System.out.println("roasts = " + roasts);

            roasts.remove("espresso");
            System.out.println("roasts = " + roasts);

            while (roasts.contains("light")) {roasts.remove("light");}

            System.out.println("roasts = " + roasts);

            // 7. Remove the element at index 2

            roasts.remove(2);

            System.out.println("roasts = " + roasts);

            // *************************************************** //
            // ********* Hash Maps and their Methods ************* //
            // *************************************************** //

            // 1. Create a HashMap called usernames that contains:
            //   a. first name
            //   b. Github username

            HashMap<String, String> usernames = new HashMap<>();
            usernames.put("Casey", "fridaynext");
            usernames.put("Daniel", "danielfryar");
            usernames.put("Fernando", "fmendoza");

            System.out.println("usernames = " + usernames);

            // 2. re-initialize the HashMap using the .clear() method

            usernames.clear();

            // 3. use the .put() method to add "Casey" -> "fridaynext" back to the map

            usernames.put("Casey", "fridaynext");

            // 4. use the .putIfAbsent() method to add
            //   a. "Vivian" -> "viviancan"
            //   b. "Casey" -> "XpenguinX"

            usernames.putIfAbsent("Daniel", "danielfryar");
            usernames.putIfAbsent("Casey", "XpenguinX");

            // 5. What happened with the .putIfAbsent()? Did both items get added? Why/why not?
            // 6. Use the .remove() method to remove "Casey"

            usernames.remove("Casey");
            System.out.println("usernames = " + usernames);

            // 7. Use the .replace() method to change Vivian's username to "viviancandev"

            usernames.replace("Daniel", "danielfryardev");
            System.out.println("usernames = " + usernames);

            // 8. Use the .clear() method to clear the map

            usernames.clear();
            System.out.println("usernames.isEmpty() = " + usernames.isEmpty());

            // 9. Use the .isEmpty() method to verify that it was cleared

        }
    }

