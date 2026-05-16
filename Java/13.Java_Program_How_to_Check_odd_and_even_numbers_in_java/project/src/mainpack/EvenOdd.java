package mainpack;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number: ");
		int number=sc.nextInt();
		if(number%2==0)
			System.out.println("the number you entered is an even number");
		else
			System.out.println("the number youu entered is an odd number");

	}

}
