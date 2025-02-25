package main.java.com.example;
public class Department {
    private static int departmentCount = 0;
    private int departmentId;
    private String departmentName;
 
    public Department(String departmentName) {
        this.departmentId = ++departmentCount;
        this.departmentName = departmentName;
    }
 
    public int getDepartmentId() { return departmentId; }
    public String getDepartmentName() { return departmentName; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }
 
    public static int getDepartmentCount() { return departmentCount; }
}