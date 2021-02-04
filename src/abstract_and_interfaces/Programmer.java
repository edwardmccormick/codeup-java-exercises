package abstract_and_interfaces;

import inheritance_poly.Employee;

public class Programmer extends Employee {
    public Programmer(String programmerName){
        super(programmerName);
    }

    @Override
    public void doWork() {
        System.out.println("console.log('Hello, World!')");
    }


}
