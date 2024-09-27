package inheritance;

class Car
{
	//----method for model---
	public void model()
	{
		System.out.println("Mahindra XUV 500 Basic model");
	}
	//----method for year----
	public void year()
	{
		System.out.println("2022 model");
	}
	//---method for colour---
	public void colour()
	{
		System.out.println("white colour");
	}
}
//-----Derived class for the base class
class Mahindra extends Car
{
	//----method for interior---
	public void comfort()
	{
		System.out.println("It has a good comfort in car:");
	}
	//----method for speaker-----
	public void audiosystem()
	{
		System.out.println("it has good audio system(Harman speakers)");
	}
	//-----method for for the ATS---
	public void ats()
	{
		System.out.println("Auto matic driving system");
	}
}
//-------Initial class----------
public class carexample {


	public static void main(String[] args) {
		//---create the object for the mahindra class
		Mahindra Mc = new Mahindra();
		Mc.model();
		Mc.year();
		Mc.colour();
		Mc.ats();

	}

}



