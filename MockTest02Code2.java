package in.ineuron.com;

import java.util.Scanner;

abstract class Shape {
	double area;
	double length;
	double breadth;
	double radius;
	double height;
	final double pi = 3.142;
	Scanner sc = new Scanner(System.in);

	abstract public void input();

	abstract double calculateArea();

}

class Rectangle extends Shape {
	public void input() {
		System.out.println("Enter length of rectangle");
		length = sc.nextDouble();
		System.out.println("Enter breadth of rectangle");
		breadth = sc.nextDouble();
	}

	public double calculateArea() {
		area = length * breadth;
		return area;
	}
}

class Circle extends Shape {
	public void input() {
		System.out.println("Enter radius of circle");
		radius = sc.nextDouble();
	}

	public double calculateArea() {
		area = pi * radius * radius;
		return area;
	}
}

class Triangle extends Shape {
	public void input() {
		System.out.println("Enter breadth of Triang;e");
		breadth = sc.nextDouble();
		System.out.println("Enter height of Triangle");
		height = sc.nextDouble();
	}

	public double calculateArea() {
		area = 0.5 * breadth * height;
		return area;
	}
}

class ShapeCalculator {

	public void printArea(Shape shape) {
		shape.input();
		shape.calculateArea();
		System.out.println("area is = " + shape.calculateArea());
	}
}

public class MockTest02Code2 {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Triangle t = new Triangle();
		ShapeCalculator s = new ShapeCalculator();
		s.printArea(r);
		s.printArea(c);
		s.printArea(t);
	}

}
