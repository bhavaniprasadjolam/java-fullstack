package labprogram2;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Converting Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5 / 9;

        // Displaying the result
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " degree Celsius.");

        input.close();
    }
}
