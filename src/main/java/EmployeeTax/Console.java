package EmployeeTax;

import java.util.Scanner;

public class Console {
    static int salary;
    static double tax=200;
    public static String getname() {
        System.out.println("Please Enter Employee Name:  ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    public static int getsalary(){
        System.out.println("Please Enter Your Salary:  ");
        Scanner sc = new Scanner(System.in);
        return salary = sc.nextInt();
    }
    public static void getOutput(){
        System.out.println("The Salary After deducting the Tax Is : ");
    }
}
