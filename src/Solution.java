import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//imagine a circle inscribed within a square.  You will ask
		//the user to enter the length of a side, then calculate //the area of the square, the circle, and the leftover area
		System.out.println("Please enter the side length of the square: ");
		double side = in.nextInt();
		double radius = side/2;
		double areaSq = side * side;
		double areaCi = 3.14 * radius * radius;

		System.out.println ("Square: " + areaSq +" units^2");
		System.out.println("Circle: "+ areaCi +" units^2");
		System.out.print("Leftover: "+ (areaSq - areaCi) + " units^2");

	}
}
