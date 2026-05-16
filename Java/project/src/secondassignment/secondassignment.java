package secondassignment;

import java.util.Scanner;

public class secondassignment {
private static Scanner sc;

	//the question: In this assignment, you will write a Java program that will reverse the order of numerical input.
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		int r=0;
		while(a!=0)
		{
			int d=a%10;
			r=r*10+d;
			a/=10;
		}
		System.out.println("a = "+ r);
	}

}
