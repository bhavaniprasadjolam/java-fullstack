package labprogram2;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      

        // Taking input from the user
        System.out.print("Enter the principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = input.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = input.nextDouble();

        // Calculating simple interest
        double interest = (principal * rate * time) / 100;

        // Displaying the result
        System.out.println("Simple Interest: " + interest);

        input.close();
    }
}