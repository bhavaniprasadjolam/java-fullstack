package polymorphism;

class perimetercalculator
{
	/*----------method to calculate perimeter of a circle-----------*/
	public void calcluateperimeter(float radius) {
		float perimeter=2*3.17f*radius;
		System.out.println("---------cirlce--------");
		System.out.println("radius is"+radius+"cm:");
		System.out.println("perimeter is"+perimeter+"cm");
		
		
	}
	/*----------method to calculate perimeter of a square-----------*/
	public void calcluateperimeter(int side) {
		int perimeter=4*side;
		System.out.println("---------Square--------");
		System.out.println("side is:"+side+"cm ");
		System.out.println("perimeter is:"+perimeter+"cm");
	}
		
	/*----------method to calculate perimeter of a Triangle-----------*/
	public void calcluateperimeter(int length,int breadth,int height) {
		int perimeter=length*breadth*height;
		System.out.println("---------Triangle--------");
		System.out.println("length is:"+length+"cm");
		System.out.println("breadth is:"+breadth+"cm");
		System.out.println("height is:"+height+"cm ");
		System.out.println("perimeter is:"+perimeter+"cm ");
		System.out.println("-----------------------------------------");
	}
	/*----------method to calculate perimeter of a Rectangle-----------*/
	public void calcluateperimeter(int length,int breadth) {
		int perimeter=2*length*breadth;
		System.out.println("---------Rectangle--------");
		System.out.println("length is:"+length+"cm");
		System.out.println("breadth is:"+breadth+"cm ");
		System.out.println("perimeter is:"+perimeter+"cm ");
		
	}
	
		

public class Example2 {

	public static void main(String[] args) {
		 perimetercalculator pc=new  perimetercalculator();
		 pc.calcluateperimeter(5);//square//
		 pc.calcluateperimeter(7.0f);//circle//
		 pc.calcluateperimeter(10, 5);//triangle//
		 pc.calcluateperimeter(5, 4, 7);//Rectangle//
		 
		 
		 
	}
		

	}

}
