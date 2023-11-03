//*****************
//Andrea Figueroa
//HW 4- Exception Handling
//Programming Exercise 12.5, 11.1
//Spring 2023
//COSC 1337
//*****************
public class Triangle extends GeometricObject{
	//instance variables
	private double side1;
	private double side2;
	private double side3;
	
	//no-arg constructor, constructs a triangle with default sides
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	//constructor with arguments, constructs a triangle with specified sides
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException{
		/*if statements tests the rule (sum of any two sides must be greater than the other side),
		 * if the rule is true, it assigns the specified sides, and if not, it throws the IllegalTriangleException*/
		if((side1+side2 > side3) || (side1+side3 > side2) || (side2+side3 > side1)) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		} else {
			throw new IllegalTriangleException("Illegal triangle sides: sum of two sides is not greater than the other side");
		}
	}
	
	//accessor methods for side1, side2, side3
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	
	//computes and returns the area of the triangle
	public double getArea() {
		double s = (side1+side2+side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	
	//computes and returns the perimeter of the triangle
	public double getPerimeter() {
		return (side1+side2+side3);
	}
	
	//returns a string description of the triangle
	public String toString() {
		return "Triangle: side1=" + side1 + " side2=" + side2 + " side3=" + side3;
	}
}