package mainpack;

import java.util.Scanner;

public class ExceptionClass {

	public static void main(String[] args) {
		System.out.println("enter two integers");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt(), number2 = sc.nextInt();
		try {
			System.out.println(number1 / number2);
		} catch (Exception e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}

}
