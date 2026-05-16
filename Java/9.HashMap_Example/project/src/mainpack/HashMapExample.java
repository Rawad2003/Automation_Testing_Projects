package mainpack;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		System.out.print("How many entries do you want to add? : ");
		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			System.out.print("Enter key (number) : ");
			int key = sc.nextInt();
			System.out.print("Enter value (text) : ");
			String value = sc.next();

			if (map.containsKey(key))
				System.out.println("Warning: Key " + key + " already exists! value will be overwritten.");
			map.put(key, value);
		}
		System.out.println("\nIterating Hashmap...");
		for (Map.Entry<Integer, String> entry : map.entrySet())
			System.out.println(entry.getKey() + " " + entry.getValue());

	}

}

