package inheritance;
import java.util.Scanner;

/*------base class----*/
class redbus
{
	 
	String superluxary;
	String Deluxe;
	String volve;
	 Scanner sc;
	 String b1,b2,b3;
	 String choice;
	
	
	/*-----method to inputdetails----------*/
	public void inputdetails() {
		
		 sc=new Scanner(System.in);
		System.out.println("----------Types of buses are---------");
		System.out.println("Enter the buses name:");
		b1=sc.next();
		b2=sc.next();
		b3=sc.next();
		System.out.println("-----------------------");
	}
      /*--------------diplaying the details-----*/
 public void displaydetails() {
	 System.out.println("-------buses ----------");
	 System.out.println("b1="+b1);
	 System.out.println("b2="+b2);
	 System.out.println("b3="+b3);
	 System.out.println("-------------------");
	 
	 
 }
	 
}
/*--------------derived class ----------------*/
  class  buses extends redbus
  {
	  public void info() {
		  String bus;
		  super.inputdetails();
		  System.out.println("bus name:");
		  bus=super.sc.next();
          super.displaydetails();
		  if(bus ==volve) {
			  System.out.println("u should more than 1500rs:");
		
		  }
			  else if(bus==superluxary) {
				  System.out.println("u shoud pay 1000rs");
			  }
			  else if(bus==Deluxe) {
				  System.out.println("u should pay less than 500rs:");
			  }
			  else {
				  System.out.println("no buses are found:");
			  }
	  }
		  
	  }

	  
  
public class Bus {

	public static void main(String[] args) {
	    buses b=new buses();
	    b.info();

	  
	}

}
