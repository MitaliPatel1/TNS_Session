package javacourse;

import java.util.Scanner;

public class Areamain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length :");
		int l = sc.nextInt();
		System.out.println("Enter Breadth  : ");
		int b=sc.nextInt();
		Area ar = new Area();
		ar.setDim(l, b);
		System.out.println("Area of rectangle is  :"+ar.getArea());

	}

}
