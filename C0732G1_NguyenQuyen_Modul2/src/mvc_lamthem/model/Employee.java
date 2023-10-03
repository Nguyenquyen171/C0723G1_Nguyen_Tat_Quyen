package mvc_lamthem.model;

public class Employee extends Person {
    private double salary;

    public Employee(String id, String name, String birthDay, String phoneNumber, String email, String address, double salary) {
        super(id, name, birthDay, phoneNumber, email, address);
        this.salary = salary;
    }
    public Employee(){

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
