package org.example;

import java.util.Scanner;

public class Calculator {
    public void compute() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the first number(a): ");
        double a = sc.nextDouble();
        System.out.println("\nEnter the second number(b): ");
        double b = sc.nextDouble();
        do{
            System.out.println("\nNow, enter 1 for addition, 2 for subtraction, 3 for multiplication, " +
                    "4 for division, 5 for modulus , 6 for raising a to the power b and 7 for exit");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("\nThe sum of " + a + " and " + b + " : " + addition(a, b));
                    break;
                case 2:
                    System.out.println("\nThe subtraction of " + a + " and " + b + " : " + subtraction(a, b));
                    break;
                case 3:
                    System.out.println("\nThe multiplication of " + a + " and " + b + " : " + multiplication(a, b));
                    break;
                case 4:
                    System.out.println("\nThe division of " + a + " and " + b + " : " + division(a, b));
                    break;
                case 5:
                    System.out.println("\nThe modulus of " + a + " and " + b + " : " + modulus(a, b));
                    break;
                case 6:
                    System.out.println("\n" + a + " raised to the power of " + b + " : " + exponent(a, b));
                    break;
                case 7:
                    System.out.println("\n\nThanks for using this customized calculator!");
                    break;
                default:
                    break;
            }
        } while (n != 7);
    }

    public double addition (double a,double b) {
        return a + b;
    }

    public double subtraction (double a,double b) {
        return a - b;
    }

    public double multiplication (double a,double b) {
        return a * b;
    }

    public double division (double a,double b) {
        return a / b;
    }

    public double modulus (double a,double b) {
        return a % b;
    }

    public double exponent (double a,double b) {
        return Math.pow(a,b);
    }

}
