package mainpack;

public class multimain {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 5, 6, 7 }, { 10, 20, 30 } };
		int sum = 0, i = 0, j = 0;
		for (int[] row : arr) {
			for (int value : row) {
				System.out.println("Value is: " + value);
				sum += value;
			}
		}
		System.out.println("the summation: " + sum);
	}

}
