package main.java.com.example;
public class Manager extends Employee {
    private double bonus;
 
    public Manager(int empId, String name, String department, double salary, double bonus, EmployeeType type) {
        super(empId, name, department, salary, java.time.LocalDate.now(), type);
        this.bonus = bonus;
    }
 
    @Override
    public double calculateAnnualSalary() {
        return super.getSalary() * 12 + bonus;
    }
 
    @Override
    public String toString() {
        return super.toString() + ", Bonus: " + bonus;
    }
}