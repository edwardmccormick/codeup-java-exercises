public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i<=15) {
//            System.out.print(i + " ");
//            i++;}
//        int number = 100;
//        do {
//            System.out.println((number -= 5) + " ");} while (number>=-9);
//
//        int number = 0;
//        do {System.out.println((number += 2));} while (number<=99);
//
//        double number = 2;
//        do {
//            System.out.println(number);number = Math.pow(number,2);} while (number<1000000);
        int i = 0;
        while (i<=100) {
            if (i % 15 == 0) {
                System.out.println("FIZZBUZZ");
            }
            else if (i % 5 == 0) {
                System.out.println("buzz");
            }
            else if (i % 3 == 0) {
                System.out.println("fizz");
            } else {
                System.out.println(i);};
                i++;

            ;
        }

            }
}
