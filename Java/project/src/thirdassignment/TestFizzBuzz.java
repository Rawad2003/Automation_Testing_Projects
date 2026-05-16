package thirdassignment;

public class TestFizzBuzz {

	public static void main(String[] args) {

		FizzBuzz tester = new FizzBuzz();

		System.out.println(tester.fizzBuzz(9));
		System.out.println(tester.fizzBuzz(10));
		System.out.println(tester.fizzBuzz(15));
		System.out.println(tester.fizzBuzz(7));
		System.out.println(tester.fizzBuzz(9, "Hello", "World", "HelloWorld"));
		System.out.println(tester.fizzBuzz(10, "Hello", "World", "HelloWorld"));
		System.out.println(tester.fizzBuzz(15, "Hello", "World", "HelloWorld"));
		System.out.println(tester.fizzBuzz(7, "Hello", "World", "HelloWorld"));
	}

}
