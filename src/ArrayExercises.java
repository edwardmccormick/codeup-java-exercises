import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4};
        System.out.println(Arrays.toString(numbers));

        Person [] team = new Person[3];
        team[0] = new Person("Daniel Fryar");
        team[1] = new Person("Casey Friday");
        team[2] = new Person("Kenneth Howell");

        for (Person individual : team) {
            System.out.println(individual.getName());
        }



    }
}
