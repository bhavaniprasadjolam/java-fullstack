package labprograms3;
import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
     //	creating object to Scanner class
		Scanner sc=new Scanner(System.in);
		
		
				//check number is palindrome or not
				
				int rem,originalNum,reverseNum=0;
				System.out.println("Enter a number");
				int number = sc.nextInt();
				 originalNum =number;
				while(number!=0) {
					rem=number%10;
					reverseNum=(reverseNum*10)+rem;
					number=number/10;
				}
				
				if(reverseNum == originalNum) {
					System.out.println("----------------------");
					System.out.println("Number is Palindrome");
					System.out.println("----------------------");
					
				}
				else {
					System.out.println("----------------------------");
					System.out.println("Number is not a Palindrome");
					System.out.println("----------------------------");
				}

			}

		}
