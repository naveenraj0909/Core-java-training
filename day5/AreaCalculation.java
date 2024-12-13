package com.day5;

class Shapes {
	int length;
	int breadth;
	int side;
	int height;

	public Shapes(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public Shapes(int side) {
		super();
		this.side = side;
	}

	public Shapes(int length, int breadth, int height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	void area() {
		System.out.println("Cannot define a Area of a Shape");
	}

}

class Rectangle extends Shapes {

	public Rectangle(int length, int breadth) {
		super(length, breadth);
		
	}
	
	void area() {
		int area = length * breadth;
		System.out.println("Area of the Rectangle = "+area);
	}
	
}

class Square extends Shapes{

	public Square(int side) {
		super(side);
		
	}
	void area() {
		int area = side * side;
		System.out.println("The Area of the Square = "+area);
	}
	
}

class Triangle extends Shapes{

	public Triangle(int length, int breadth, int height) {
		super(length, breadth, height);
	}
	
	void area() {
		int area = (length * breadth * height)/2;
		System.out.println("The Area of the Triange = "+area);
	}
	
}

public class AreaCalculation {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10,20);
		rectangle.area();
		
		Square square = new Square(5);
		square.area();
		
		Triangle triangle = new Triangle(2,3,4);
		triangle.area();
		
	}

}
