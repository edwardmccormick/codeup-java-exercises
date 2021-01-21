package syntax;

public class syntaxlecture {

//    psvm - IntelliJ shortcut for the following method - although it doesn't appear to work on my setup :(
    public static void main(String[] args) {

        // ================== STATEMENTS (s-3)

        // Statements may be...
        // Declarations
        int number = 7; // = is just assignment in Java
        int number2;

        // Assignment expressions

        number2 = 243;

        // Any use of ++ or --
        --number;   //decremented BEFORE it's evaluated
        System.out.println("The number's value after pre-decremeneted is " + number);
        number2++;  //this will be incremented AFTER it's evaluated on this line
        System.out.println("The number's value after post-incrementing is: " + number);

        System.out.println("Pre incrementing " + number + " = " + --number);
        System.out.println("Post-incrementing number " + number + " = " + number++);
        System.out.println("The number is now " + number);

        // Method invocations
        Math.random(); //call the "random()" method from the math class.

        //let's say we want to assign a random number to a variable

        double randomNumber = Math.random();
        System.out.println("Our random number is: " + randomNumber);

        // Object creation expressions

        // ================== COMMENTS (s-4)



//        see JavaDocTest in docs package


        // ================== DATA TYPES (s-5, 6, 7)


        // use the smallest type needed for the job

        // primitive types...

//            byte age = -32;
//        System.out.println(age);
//            short minimumAnnualSalary = 15080;
            int distanceToSaturn = 1200000000;
            long numberOfHumanCells = 3000000000L; // L needed for compiler

//        To access something at the index 1 of a database, using longs
        // books[1L] renders the 1 as a long type


            System.out.println(numberOfHumanCells);
            float lengthOfBacteriaInInches = 0.00004F; // F needed for compiler
            System.out.println(lengthOfBacteriaInInches);
            double widthOfAtomInMeters = .00000000001;
            System.out.println(widthOfAtomInMeters);
        char seatingSection = 'M'; // must wrap in single quotes
//            boolean everythingIsAwesome = false;

        // strings (not a primitive type)

                 String thisIsAString = "Hello";
        System.out.println(thisIsAString);

//              like in JS, strings must escape certain characters like quotes and use it to inject newline characters and other formatting
        System.out.println("Hello \nWorld");


        // ================== VARIABLES (s-8)

        // declaration separate from initialization
        int faveNumber; // declared the variable
        faveNumber = 42;


        // declaration and initialization
        int myFaveNumber = 42;


        // ================== IDENTIFIERS AND KEYWORDS (s-9)

        // see curriculum


        // ================== CONSTANTS (s-10)

        // see curriculum


        // ================== EXPRESSIONS (s-11)

        // basically the same as JS


        // ================== OPERATORS (s-12)

        // basically the same as JS


        // ================== ASSIGNMENT STATEMENTS (s-13)

        // basically the same as JS


        // ================== CASTING (s-14)

        // Link on casting... http://www.javainterviewpoint.com/type-casting-java-implicit-explicit-casting/


        // IMPLICIT
        short x = 8;
        int v = x;

        // EXPLICIT

        int civDollars = 20999999;
        byte civSandwich = (byte) civDollars;
        System.out.println(civSandwich);

        // implicit casting - less to more precise (widening)

//                 float num1 = 2.22F;
//                 double num2 = num1;


        // explicit casting - more to less explicit casting (narrowing)

//                 double num3 = 3.1;
//                 float num4 = (float) num3;
//
//                System.out.println(num4);

    }

}


