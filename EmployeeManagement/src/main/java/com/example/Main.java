package main.java.com.example;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        List<Department> departments = new ArrayList<>();
        
        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Add Manager");
            System.out.println("3. Add Department");
            System.out.println("4. Display Employees");
            System.out.println("5. Display Departments");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int empId = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Enter Department: ");
                    String dept = scanner.nextLine();
                    
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    
                    System.out.print("Enter Joining Year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter Joining Month: ");
                    int month = scanner.nextInt();
                    System.out.print("Enter Joining Day: ");
                    int day = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Enter Employee Type (FULL_TIME / PART_TIME / CONTRACT): ");
                    EmployeeType type = EmployeeType.valueOf(scanner.nextLine().toUpperCase());
                    
                    employees.add(new Employee(empId, name, dept, salary, LocalDate.of(year, month, day), type));
                    System.out.println("Employee Added Successfully!");
                    break;
                    
                case 2:
                    System.out.print("Enter Manager ID: ");
                    int mgrId = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Enter Name: ");
                    String mgrName = scanner.nextLine();
                    
                    System.out.print("Enter Department: ");
                    String mgrDept = scanner.nextLine();
                    
                    System.out.print("Enter Salary: ");
                    double mgrSalary = scanner.nextDouble();
                    
                    System.out.print("Enter Bonus: ");
                    double bonus = scanner.nextDouble();
                    
                    System.out.print("Enter Employee Type (FULL_TIME / PART_TIME / CONTRACT): ");
                    scanner.nextLine();
                    EmployeeType mgrType = EmployeeType.valueOf(scanner.nextLine().toUpperCase());
                    
                    employees.add(new Manager(mgrId, mgrName, mgrDept, mgrSalary, bonus, mgrType));
                    System.out.println("Manager Added Successfully!");
                    break;
                    
                case 3:
                    System.out.print("Enter Department Name: ");
                    String deptName = scanner.nextLine();
                    departments.add(new Department(deptName));
                    System.out.println("Department Added Successfully!");
                    break;
                    
                case 4:
                    System.out.println("\nEmployee List:");
                    for (Employee emp : employees) {
                        System.out.println(emp);
                    }
                    break;
                    
                case 5:
                    System.out.println("\nDepartment List:");
                    for (Department deptObj : departments) {
                        System.out.println("ID: " + deptObj.getDepartmentId() + ", Name: " + deptObj.getDepartmentName());
                    }
                    break;
                    
                case 6:
                    System.out.println("Exiting Employee Management System...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
