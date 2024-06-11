package com.neo.model;
import java.util.*;

public class Department {
    private String department;
    ArrayList<Designation> d = new ArrayList<>();

    public void getDepartment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Department:");
        department = sc.nextLine();
        String more;
        do {
            Designation designation = new Designation();
            designation.getDesignation();
            d.add(designation);

            System.out.print("Add another designation to this department? (yes/no): ");
            more = sc.nextLine();
        } while (more.equalsIgnoreCase("yes"));
    }

    public void printDepartment() {
        System.out.println("Department: " + department);
        for (Designation designation : d) {
            designation.printDesignation();
        }
    }
}
