package fourthassignment;

import java.util.ArrayList;

public class TestOrders {

	public static void main(String[] args) {
		// Items:
		Item item1 = new Item("mocha", 5.50);
		Item item2 = new Item("latte", 4.75);
		Item item3 = new Item("drip coffe", 2.50);
		Item item4 = new Item("cappuccino", 4.25);

		// Orders:
		Order order1 = new Order("Cindhuri", 0, false, new ArrayList<Item>());
		Order order2 = new Order("Jimmy", 0, false, new ArrayList<Item>());
		Order order3 = new Order("Noah", 0, false, new ArrayList<Item>());
		Order order4 = new Order("Sam", 0, false, new ArrayList<Item>());

		// Print order1 to console
		System.out.printf("Name: %s\n", order1.name);
		System.out.printf("Total: %s\n", order1.total);
		System.out.printf("Ready: %s\n", order1.ready);

		// Add item1 (mocha) to order2 (Jimmy)
		order2.items.add(item1);
		order2.total += item1.price;

		// Noah ordered a cappuccion
		order3.items.add(item4);
		order3.total += item4.price;

		// Sam added a latte
		order4.items.add(item2);
		order4.total += item2.price;

		// Cindhuri's order is now ready
		order1.ready = true;

		// Sam ordered 2 more lattes
		for (int i = 0; i < 2; i++) {
			order4.items.add(item2);
			order4.total += item2.price;
		}

		// Jimmy's order is now ready
		order2.ready = true;

		// final status
		System.out.println("\n--- Final Order Status ---");
		System.out.printf("Cindhuri | Total: $%.2f | Ready: %s\n", order1.total, order1.ready);
		System.out.printf("Jimmy | Total: $%.2f | Ready: %s\n", order2.total, order2.ready);
		System.out.printf("Noah | Total: $%.2f | Ready: %s\n", order3.total, order3.ready);
		System.out.printf("Sam | Total: $%.2f | Ready: %s\n", order4.total, order4.ready);
	}

}
