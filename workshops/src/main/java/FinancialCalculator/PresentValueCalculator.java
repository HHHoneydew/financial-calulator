package FinancialCalculator;

import java.util.Scanner;

public class PresentValueCalculator {
static Scanner presentScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How much annuity do you want to earn? ");
        double amtEarned = presentScanner.nextDouble();
        System.out.println("How much is the expected interest rate? ");
        double interestEarned = presentScanner.nextDouble();
        System.out.println("In how many years do you expect to earn this? ");
        int years = presentScanner.nextInt();
    }

}
// PV = P * (1-1/(1+r)math.pow)/r