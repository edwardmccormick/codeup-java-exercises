package inheritance_poly;

import abstract_and_interfaces.Programmer;

public class MainTest {
    public static void main(String[] args) {

        Employee[] codeup = new Employee[2];

        Person fer = new Person("Fer");
        fer.sayHello();

        Employee sophie = new Programmer("Sophie");
        codeup[0] = sophie;
        sophie.sayHello();

        SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");

        System.out.println(theManOfSteel.getName()); // "Superman"
        System.out.println(theManOfSteel.getSecretIdentity()); // "Clark Kent"

        Manager[] codeupManagers = new Manager[1];
        Manager dmitri = new Manager("Dmitri");
        codeup[1] = dmitri;

        for (Employee e: codeup) {
            System.out.println(e.work());
        }

        System.out.println(dmitri.work());
        System.out.println(sophie.work());
        sophie.doWork();
        dmitri.sayHello();
    }
}
