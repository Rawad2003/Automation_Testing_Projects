package mainpack;

import java.util.Scanner;

public class readwritemain {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int row, column;

		do {
			System.out.print("Enter row for the array (max 10) : ");
			row = sc.nextInt();
			if (row > 10)
				System.out.println("Invalid, row must be 10 or less, Try again");
		} while (row > 10);

		do {
			System.out.print("Enter column for the array (max 10) : ");
			column = sc.nextInt();
			if (column > 10)
				System.out.println("Invalid, column must be 10 or less, Try again");
		} while (column > 10);

		int[][] array = new int[row][column];

		System.out.println("Enter " + (row * column) + " Array Elements : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
			array[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("The array is : ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
			System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
