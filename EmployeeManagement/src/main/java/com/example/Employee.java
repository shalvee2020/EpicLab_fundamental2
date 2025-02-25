package main.java.com.example;
import java.time.LocalDate;

public class Employee {

   
    private int empId;
    private String name;
    private String department;
    private double salary;
    private LocalDate joiningDate;
    private EmployeeType employeeType;
 
    public Employee() {
        this(0, "Unknown", "None", 0.0, LocalDate.now(), EmployeeType.FULL_TIME);
    }
    public Employee(int empId, String name, String department, double salary, LocalDate joiningDate, EmployeeType type) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.employeeType = type;
    }
 
    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }
 
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
 
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
 
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
 
    public LocalDate getJoiningDate() { return joiningDate; }
    public void setJoiningDate(LocalDate joiningDate) { this.joiningDate = joiningDate; }
 
    public EmployeeType getEmployeeType() { return employeeType; }
    public void setEmployeeType(EmployeeType employeeType) { this.employeeType = employeeType; }
 
    // Method Overloading for toString
    @Override
    public String toString() {
        return String.format("Employee[ID: %d, Name: %s, Dept: %s, Salary: %.2f, Type: %s]",
                empId, name, department, salary, employeeType);
    }
 
    // Annual Salary Calculation (to be overridden)
    public double calculateAnnualSalary() {
        return this.salary * 12;
    }
}

