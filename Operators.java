package labprograms3;
import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		//operations on operators
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		 int choice;
		do {
		System.out.println("mini calculator:");
		System.out.println("------------------------------------------");
		//enter the 1st and 2nd number//
        System.out.println("enter the 1st number:");
		  n1=sc.nextInt();
		System.out.println("enter the 2nd number:");
	      n2=sc.nextInt();
		//enter the symbol -----//
		System.out.println("enter the symbol +,-,*,/,%:");
		String symbol=sc.next();
		System.out.println("------------------------------------------");
		
		switch(symbol) {
		//displaying result of two numbers//
		case "+":
			System.out.println("sum of two number is : "+(n1+n2));
	        System.out.println("--------------------------------------");
			break;
		case "-":
			System.out.println("difference of two number is :"+(n1-n2));
	        System.out.println("--------------------------------------");
			break;
		case "*":
			System.out.println("product of two number is :"+(n1*n2));
	        System.out.println("----------------------------------------");
			break;
		case "/":
			System.out.println("division of two number is : "+(n1/n2));
	        System.out.println("--------------------------------------");
		    break;
		case "%":
			System.out.println("module of two numbers is:"+(n1%n2));
	        System.out.println("-------------------------------------");
			break;
	  default:
			System.out.println("wrong output");
			System.out.println("-------------------------------------");
	}
		 /*Asking to user to repeat or terminate*/
			System.out.println("press 0 to exit or anyother number to contine:" );
			choice=sc.nextInt();
			System.out.println("----------------------------------");
				}
				while(choice!=0);
			

	}
}

         



