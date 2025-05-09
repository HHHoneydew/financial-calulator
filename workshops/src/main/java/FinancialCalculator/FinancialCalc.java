package FinancialCalculator;

import java.util.Scanner;
public class FinancialCalc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much is the loan? ");
        double principal = scanner.nextDouble();
        System.out.println("How many years is the loan?");
        int years = scanner.nextInt();
        double interest = 0.07265;
        int months = years * 12;
        double monthlyInterest = interest/12;

        double monthlyPayment = principal * (monthlyInterest*Math.pow(1+monthlyInterest,months))
                /(Math.pow(1+monthlyInterest,months)-1);
        System.out.println("Your monthly payment is: "+String.format("%.2f", monthlyPayment));
        scanner.close();




    }







}
