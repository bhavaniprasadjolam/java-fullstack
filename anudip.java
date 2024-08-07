package labprograms3;
import java.util.Scanner;

public class anudip {

	public static void main(String[] args) {
		//taking input from user
		Scanner sc=new Scanner(System.in);
		//check he/she is suitable for anudip or not
		int id;
		int code;
		System.out.println("enter the code:");
		code=sc.nextInt();
		System.out.println("Enter the candidate  id:");
		id =sc.nextInt();
		
		if(code==id) {
			System.out.println("----------------------------------------");
			System.out.println(" person he/she is suitable candidate for anudip..");
		}
		
			else {
				System.out.println("-------------------------------------");
				System.out.println(" he/she not suitable candidate for anudip.");
			}
			
		}

	}


