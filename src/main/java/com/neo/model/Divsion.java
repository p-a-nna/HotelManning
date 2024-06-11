package com.neo.model;
import java.util.*;

public class Divsion {
    private String division;
    ArrayList<Department> dept = new ArrayList<>();
    public void getDivision() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Division:");
        division = sc.nextLine();
        String more;
        do {
            Department department = new Department();
            department.getDepartment();
            dept.add(department);
            System.out.print("Add another department to this division? (yes/no): ");
            more = sc.nextLine();
        } while (more.equalsIgnoreCase("yes"));
    }

    public void printDivision() {
        System.out.println("Division: " + division);
        for (Department department : dept) {
            department.printDepartment();
        }
    }
}
