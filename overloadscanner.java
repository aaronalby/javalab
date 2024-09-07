package javalab;
import java.util.Scanner;
class Areacalculate {
	public double circle(double radius ) {
		return 3.14*radius*radius;
	}
	public double rectangle(double width, double length ) {
		return length*width;
	}
	public double triangle(double breadth, double height ) {
		return (breadth*height)/2;
	}
}
public class overloadscanner {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		areacalculator c= new areacalculator();
		System.out.println("enter the radius of the circle ");
				double radius =sc.nextDouble();
				System.out.println("AREA OF THE CIRLCE: "+c.circle(radius));
		System.out.println("enter the width of rectangle ");
		double width = sc.nextDouble();
		System.out.println("enter the length of rectangle ");
		double length = sc.nextDouble();
		System.out.println("AREA OF THE RECTANGLE: "+c.rectangle(width,length));
		System.out.println("enter the base of triangle ");
		double breadth = sc.nextDouble();
		System.out.println("enter the height of triangle ");
		double height = sc.nextDouble();
		System.out.println("AREA OF THE TRIANGLE: "+c.triangle(breadth,height));
	}

}

