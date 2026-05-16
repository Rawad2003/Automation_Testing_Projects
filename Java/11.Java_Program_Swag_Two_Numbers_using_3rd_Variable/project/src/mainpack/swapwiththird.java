package mainpack;

import java.util.Scanner;

public class swapwiththird {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter value of a: ");
		int a = sc.nextInt();
		System.out.print("enter value of b: ");
		int b = sc.nextInt(), c;
		c = a;
		a = b;
		b = c;
		System.out.println("the value of a: " + a + "\nthe value of b: " + b);
	}

}
