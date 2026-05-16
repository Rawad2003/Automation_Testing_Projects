package firstassignment;

import java.util.Scanner;//used for the inputs

public class firstassignment {

//the question: Write a JAVA program which takes an integer as input, and checks if this value i divided by 4.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// this must be implemented when we use the Scanner
		System.out.print("enter the number: ");
		int i = sc.nextInt();// for integers
		if (i % 4 == 0)
			System.out.println("the number is divided by 4");
		else
			System.out.println("the number is not divided by 4");
	}

}
