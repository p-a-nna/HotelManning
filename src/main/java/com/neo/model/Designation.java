package com.neo.model;
import java.util.*;

public class Designation {
    private String designation;
    private int count;
    private int grade;
    public void getDesignation()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Designation:");
        designation=sc.nextLine();
        System.out.println("Count:");
        count=sc.nextInt();
        System.out.println("Grade:");
        grade=sc.nextInt();
    }
    public void printDesignation() {
        System.out.println("  Designation: " + designation);
        System.out.println("  Count: " + count);
        System.out.println("  Grade: " + grade);
    }
}
