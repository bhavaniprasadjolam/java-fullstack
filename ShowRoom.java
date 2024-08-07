package labprograms3;

//import scanner package
import java.util.Scanner;
//now create the default constructor.
class ShowRoom1
{
	//----member variable----
	String name;
	long mobno;
	double cost;
	double amount;
	double disc;
	//constructor.
	public ShowRoom1()
	{
		name="user1";
		mobno=00000000;
		cost=00.0;
		amount=00.0;
	}
	public void input()
	{
		//creating the object class.
		Scanner sc = new Scanner(System.in);
		//input through the keyboard.
		System.out.print("Enter the name of the customer : ");
		name = sc.next();
		
		System.out.print("Enter the mobile number : ");
		mobno = sc.nextLong();
		
		System.out.print("Enter the cost : ");
		cost = sc.nextDouble();
		}
	//-----calculate the Discount------
	public void calculate()
	{
		
		if(cost<=10000)
		{
			disc = cost*(0.05);
		}
		else if(cost>10000 && cost<=20000)
		{
			disc = cost*(0.10);
		}
		else if(cost>20000 && cost<=35000)
		{
			disc = cost*(0.15);
		}
		else if(cost>35000)
		{
			disc = cost*(0.20);
		}
		amount= cost-disc;
	}
	//---display the data after the discount-----
	public void display()
	{
		System.out.println("-----------Total Billing------------");
		System.out.println("customer name: "+name);
		System.out.println("mobile number: "+mobno);
		System.out.println("amount to be paid after discount: "+amount);
		System.out.println("-----------Thank you---------------");
	}
}
public class ShowRoom {

	public static void main(String[] args) {
		//create the object for the class
		ShowRoom1 SR = new ShowRoom1();
		SR.input();
		SR.calculate();
		SR.display();
	}

}

