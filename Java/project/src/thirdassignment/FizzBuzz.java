package thirdassignment;

public class FizzBuzz {

	// the Basic method
	public String fizzBuzz(int number) {
		if (number % 15 == 0)
			return "FizzBuzz";
		else if (number % 3 == 0)
			return "Fizz";
		else if (number % 5 == 0)
			return "Buzz";
		else
			return String.valueOf(number);

	}

	//the overloaded method
	public String fizzBuzz(int number, String multOf3Word,String multOf5Word,String multOf15Word)
	{
		if (number % 15 == 0)
			return multOf15Word;
		else if (number % 3 == 0)
			return multOf3Word;
		else if (number % 5 == 0)
			return multOf5Word;
		else
			return String.valueOf(number);
	}
}
