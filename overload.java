package javalab;

class areacalculator {
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
public class overload {
	public static void main(String args[]) {
		areacalculator c= new areacalculator();
		System.out.println("area of the circle is "+c.circle(6));
		System.out.println("area of the rectangle  is "+c.rectangle(5,10));
		System.out.println("area of the triangle is "+c.triangle(4,5));
	}

}
