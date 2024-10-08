package labprogram2;
import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the first angle: ");
        int angle1 = input.nextInt();

        System.out.print("Enter the second angle: ");
        int angle2 = input.nextInt();

        System.out.print("Enter the third angle: ");
        int angle3 = input.nextInt();

        // Checking if the angles form a triangle
        if (angle1 + angle2 + angle3 == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("The angles form a valid triangle.");
        } else {
            System.out.println("The angles do not form a valid triangle.");
        }

        input.close();
    }
}