public class MethodsLec {
//    public static void main(String[] args) {
//    }
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public int subtractNumbers(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
//        this main method can be seen as separate from the MethodsLec class, so we need to instantiate all variables again that we want to use in logical calculations here

//        For example, adding two numbers

//        Static

        System.out.println("Using our static method");
        System.out.println(MethodsLec.addNumbers(2,2));
//        Non-Static
        MethodsLec mathWiz = new MethodsLec();
        int difference = mathWiz.subtractNumbers(10,6);
        System.out.println("Using a non-static method");
        System.out.println(difference);
        System.out.println(MethodsLec.tenureMessage("Casey","PHP",11));
        System.out.println(MethodsLec.tenureMessage("Daniel","Java",15));
        System.out.println(MethodsLec.tenureMessage("Fernando","PHP",30));
        System.out.println(MethodsLec.tenureMessage("Java"));
        System.out.println(MethodsLec.tenureMessage("Casey", "PHP"));
        MethodsLec.sayHello(5);
        MethodsLec.sayHello("Bonjour","Jean Luc");
        MethodsLec.sayHello("Bobby");
        MethodsLec.count(6);
        System.out.println(MethodsLec.getPower(6, 3));
        System.out.println(MethodsLec.getPowerRecursive(6,3));
    }

    public static String tenureMessage(String name, String progLang, int numYears) {
//        Yada, yada, lots of code
        return name + " has been coding " + progLang + " for " + numYears + " years.";
    }

//    Method Overloading
    public static String tenureMessage(String name, String progLang) {
        return name + " is super good at " + progLang;
    }

    public static String tenureMessage(String progLang) {
        return "Someone is sure to be good at " + progLang;
    }

    // version 1
    public static void sayHello(int times) {
        for (int i = 0; i < times; i += 1) {
            sayHello();
        }
    }
    // version 2
    public static void sayHello() {
        sayHello("Hello", "World");
    }
    // version 3
    public static void sayHello(String name) {
        sayHello("Hello", name);
    }
    // version 4
    public static void sayHello(String greeting, String name) {
        System.out.println(greeting + ", " + name + "!");
    }

    public static void  count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count (n-1);
    }
    public static long getPower(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <=exponent; i++) {
            result = result * base;
        }
        return result;
    }
    public static long getPowerRecursive(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent ==1) {
            return base;
        } else if (exponent ==2) {
            return base * base;
        }
        return base * getPowerRecursive(base, exponent-1);
    }
}
