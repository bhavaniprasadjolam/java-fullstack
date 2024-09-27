package constructor;
import java.util.Scanner;


class circle{
	/*-----member variable--*/
	private float radius;
	
	//contructor//
	circle(){
	radius=0;
	}
	
	/*----------taking inputs from keyboard------*/
	public void circleinputs() {
	/*-----creating scanner object----*/
	Scanner sc=new Scanner(System.in);
	/*---taking inputs from keyboard---*/
	System.out.println("Enter radius of circle is:");
	radius=sc.nextFloat();
	System.out.println("--------------------");
	}
	
	/*-----method to display radius-----*/
	public void displayradius() {
		System.out.println("-------circle---------");
		System.out.println("radius is :"+radius+"cm");
	}
	/*-------method to calculate area---------*/
	public void calculatearea() {
		float area;
		area=3.14f*radius*radius;
		System.out.println("Area is :"+area+"cm");
	}
	/*--------method to calculate perimeter----------*/
	public void calculateperimeter() {
		float perimeter;
		perimeter=2*3.14f*radius;
		System.out.println("perimeter is :"+perimeter+"cm");
		System.out.println("------------------------");
	}
	
}
/*------------initial class------*/

public class circleoperation {

	public static void main(String[] args) {
		/*creation of circle object*/
		circle circleobj=new circle();
		/*inputs of circle*/
		circleobj.circleinputs();
		/*displaying radius*/
		circleobj.displayradius();
		/*area of circle*/
		circleobj.calculatearea();
		/*perimeter of circle*/
		circleobj.calculateperimeter();

	}

}
