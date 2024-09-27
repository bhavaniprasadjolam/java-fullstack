package Iterations;
import java.util.Scanner;

public class numericCalculator {

	
	public static void main(String[] args) {
		//**creating a scanner class...-/
		Scanner sc=new Scanner(System.in);
		/*--------------------*/
		/*creating a variable of two numbers..*/
		int n1,n2;
		int choice;//varaiable to decide operations should continue or not
		/*----------------------------------*/
		
		do {
			/* input of nbr through keyboard-----*/
			System.out.println("Enter a first number:");
			n1=sc.nextInt();
			System.out.println("Enter a second number:");
			n2=sc.nextInt();
			/*-----------------------------------------*/
			/*----display menu of operations to the user---*/
			System.out.println("---------------------------");
			System.out.println("numeric calculation");
			System.out.println("---------------------------");
			System.out.println("1.Addition:   ");
			System.out.println("2.Difference: ");
			System.out.println("3.product:    ");
			System.out.println("4.Division:   ");
			System.out.println("---------------------------");
			/*----------------------------------------------*/
			/*-------Asking to user to select any one operation---*/
			System.out.println("select any one operations:");
			int operation=sc.nextInt();
			System.out.println("--------------------------");
			/*--------------------------------------------*/
			
			
      /*----performing the operation as per selection-----*/
	  switch(operation) {
	        
	   case 1:
		   System.out.println("---------Addition opertion-----");
		   System.out.println(" sum of "+ n1+ " and " +n2+ " is = " +(n1+n2));
		   break;
	   case 2:
		   System.out.println("-------Difference opertion------");
		   System.out.println(" Difference of " +n1+ " and " +n2+ " is = " +(n1+n2));
		   break;
	   case 3:
		   System.out.println("--------product operation------");
		   System.out.println(" product of: " +n1+ " and " +n2+ " is = " +(n1*n2));
		   break;
	   case 4:
		   System.out.println("-------Division operation------");
		   System.out.println(" on dividing: " +n1+ " by " +n2);
		   System.out.println("Quotient=" +(n1/n2));
		   System.out.println("Remainder:" +(n1%n2));
		      break;
	     default:
		   System.out.println("invalid operation:");
	
	}
	  System.out.println("----------------------");
	  /*Asking to user to continue or terminate*/
	System.out.println("press 0 to exit or anyother number to contine:");
	choice=sc.nextInt();
	System.out.println("----------------------------------");
		}
		while(choice!=0);

	}

}
