package com.neo.model;
import java.util.*;

public class Designation {
    private String designation;
    public void getDesignation()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Designation:");
        designation=sc.nextLine();
    }
    public void printDesignation() {
        System.out.println("  Designation: " + designation);
    }
}
