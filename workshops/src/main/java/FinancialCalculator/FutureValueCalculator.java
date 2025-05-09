package FinancialCalculator;

import java.util.Scanner;

public class FutureValueCalculator {
    static Scanner newScanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("How much money will you initially deposit");
        double deposit = newScanner.nextDouble();
        double annualInterest = 0.0175;
        System.out.println("How many years will you keep this amount invested?");
        int years = newScanner.nextInt();
        int days = years * 365;
        double futureV = deposit * Math.pow(1+(annualInterest / 365), days);
        System.out.println("Your initial deposit will be worth: " + String.format("%.2f",futureV)
                + " in " + years + " years");
        double totalInterest = futureV - deposit;
        System.out.println("Your total interest is " +String.format("%.2f", totalInterest));

    }
}
