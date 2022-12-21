package EmployeeTax;

import java.util.Scanner;

public class Employee {
    String name;
    boolean insurance;
    boolean wifeInsurance;
    boolean FirstChild;
    boolean SecondChild;
    int medicalPayment;

    public String getName() {
        System.out.println("Please Enter Employee Name:  ");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        return name;
    }

    public boolean isInsurance() {
        System.out.println("Do you have Insurance:  ");
        Scanner sc = new Scanner(System.in);
        insurance = sc.nextBoolean();
        return insurance;
    }

    public boolean isWifeInsurance() {
        System.out.println("Is Wife Insured:  ");
        Scanner sc = new Scanner(System.in);
        wifeInsurance = sc.nextBoolean();
        return wifeInsurance;
    }

    public boolean isFirstChild() {
        System.out.println("Is first child Insured:  ");
        Scanner sc = new Scanner(System.in);
        FirstChild = sc.nextBoolean();
        return FirstChild;
    }

    public boolean isSecondChild() {
        System.out.println("Is first child Insured:  ");
        Scanner sc = new Scanner(System.in);
        SecondChild = sc.nextBoolean();
        return SecondChild;
    }
    public int calculateTheMedicalayment(){
        getName();
        if(isInsurance()) {
            medicalPayment += 100;
        }
            if(isWifeInsurance()){
                medicalPayment+=100;
            }
            if(isFirstChild()){
                medicalPayment+=50;
            }
            if(isSecondChild()){
                medicalPayment+=50;
            }

        System.out.println("The Medical Payment "+medicalPayment);
        return medicalPayment;
    }
}
