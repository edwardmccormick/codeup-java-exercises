package inheritance_poly;

public class Employee extends Person {
    public Employee(String employeeName){
        super(employeeName);
    }

    public void doWork() {
        System.out.println("Work, work...");
    }

    public String work() {
        return "Filling out TPS reports";
    }

    // method overriding
    @Override
    public void sayHello() {
        System.out.printf("Hi, my name is %s, how can I help you?\n", this.name);
    }
}

