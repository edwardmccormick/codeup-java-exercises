package inheritance_poly;

public class Person {
    String name;

    public Person(String name) {
        this.name = name.trim();
    }

    public String getName() {
        return name;
    }

    public void sayHello() {
        System.out.println("Hello from " + name + "!");
    }
}

