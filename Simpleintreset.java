package constructor;

import java.util.Scanner;
class Simpleintreset1
{	
	// here the variables are
	private double  r,si;
   private  int T,p;
 
   
    
   Simpleintreset1()
    {
    	p=0;
    	r=0;
    	T=0;
    	
    }
	public void inputs()
		{
			    //create the scanner class
				Scanner sc =  new Scanner(System.in);
				//enter the values through keyboard.
				System.out.println("Enter the priciple amount(in rs) : ");
				p= sc.nextInt();
				
				System.out.println("Enter the rate(in %) : ");
				r = sc.nextDouble();
				
				System.out.println("Enter the time(in year) : ");
				T = sc.nextInt();
	}
	//calculate the simpleintreset.
	public void calculatesimpleintreset()
	{
		 double si = (p*r*T)/100;
		 System.out.println("intrest is ="+si);
		
	}
	public void display()
	{
		System.out.println("---------Simple intrest---------");
		System.out.println("pricipal is="+p);
		System.out.println("rate is:"+r);
		System.out.println("time is:"+T);
		System.out.println("--------------------------------");
	
		
		
	}
}
public class Simpleintreset {
		//initial class
	public static void main(String[] args) {
		//create the scanner for the object class.
		Simpleintreset1 SI = new Simpleintreset1();
		
		SI.inputs();
		SI.calculatesimpleintreset();
		SI.display();
	}
}