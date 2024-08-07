package labprograms3;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
         ;// Example number
        
        System.out.println("Enter a number:");
       int  number=sc.nextInt();
       int originalNumber = number;
       int remainder, result = 0;
      
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3); // Cubes of each digit
            originalNumber /= 10;
        }

        if (result == number) {
        	System.out.println("-------------------------------------");
            System.out.println(number + " is an Armstrong number.");
        }
        else {
        	System.out.println("---------------------------------------");
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    	
}
