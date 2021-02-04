package inheritance_poly;

public class Manager extends Employee {
    public String work() {
        return "Managing employees";
    }
    public Manager(String employeeName){
        super(employeeName);
    }

    public void doWork() {
        System.out.println("Fill out your timesheets, please.");
    }
}