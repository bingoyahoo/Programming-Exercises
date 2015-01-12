import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Task statement:
 * Write a program AreaOfTriangle.java to read 3 positive real numbers a, b and c which are the
 * length of a triangle and compute the area of the triangle using the Heron's formula.
 * area = sqrt(p * ( p -a) * (p - b) * (p - c))
 * where p is half the perimeter, i.e p = (a+b+c)/2
 * 
 * You are to use double type for the values. The output is the area displayed in 2 decimal places.
 * You may assume that the input data are positive values.
 * 
 * For modularity, you are to define a class method area(double, double, double) that takes in the 
 * lengths (positive values) and returns the computed area and a class method validTriangle(double, double, double)
 * that returns true if the 3 parameters can possibly represent the lengths of 3 sides of a triangle,
 * or false if it is impossible, in which case, the program should display "Invalid triangle!!" in the output.
 */

public class Lab0 {

	public static void main(String args[]) {
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Enter 3 lengths:");
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			double side1 = sc.nextDouble();
			double side2 = sc.nextDouble();
			double side3 = sc.nextDouble();
			if (validTriangle(side1, side2, side3)) {
				double area = area(side1, side2, side3);
				System.out.println("Area = " + df.format(area));
			} else {
				System.out.println("Invalid triangle!");
			}
		}
		sc.close();
	}

	// Returns the computed area of a triangle given three sides using the
	// Heron's Formula
	public static double area(double side1, double side2, double side3) {
		double halfPerimeter = 0.5 * (side1 + side2 + side3);
		double area = Math.sqrt(halfPerimeter * (halfPerimeter - side1)
				* (halfPerimeter - side2) * (halfPerimeter - side3));
		return area;
	}

	// Returns true if three given sides can make a triangle and false
	// otherwise.
	public static boolean validTriangle(double side1, double side2, double side3) {
		// Using the Triangle inequality theorem. Basically the sum of any 2
		// sides must be longer than the third.
		if ((side1 + side2 > side3) && (side2 + side3 > side1)
				&& (side3 + side1 > side2)) {
			return true;
		} else {
			return false;
		}
	}
}
