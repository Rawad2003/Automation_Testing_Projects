package mainpack;

import java.util.Scanner;

public class swapwithoutthird {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value of a: ");
		int a = sc.nextInt();
		System.out.print("enter value of b: ");
		int b = sc.nextInt();

		a += b;
		b = a - b;
		a -= b;
		System.out.println("the value of a: " + a);
		System.out.println("the value of b: " + b);
	}

}
