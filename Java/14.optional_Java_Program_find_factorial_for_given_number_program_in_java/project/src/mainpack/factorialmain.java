package mainpack;

import java.util.Scanner;

public class factorialmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to find the factorial: ");
		int num = sc.nextInt();
		int result = 1;
		for (int i = 1; i <= num; i++)
			result *= i;
		System.out.println("the factorial of " + num + " is: " + result);
	}

}
