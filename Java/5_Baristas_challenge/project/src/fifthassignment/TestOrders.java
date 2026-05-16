package fifthassignment;

public class TestOrders {

	public static void main(String[] args) {
		Item item1 = new Item("mocha", 5.50);
		Item item2 = new Item("latte", 4.75);
		Item item3 = new Item("drip coffe", 2.50);
		Item item4 = new Item("cappuccino", 4.25);

		Order guest1 = new Order();
		Order guest2 = new Order();

		Order order1 = new Order("Cindhuri");
		Order order2 = new Order("Jimmy");
		Order order3 = new Order("Noah");

		guest1.addItem(item1);
		guest1.addItem(item2);

		guest2.addItem(item3);
		guest2.addItem(item4);

		order1.addItem(item3);
		order1.addItem(item4);

		order2.addItem(item1);
		order2.addItem(item2);

		order3.addItem(item2);
		order3.addItem(item3);

		order1.setReady(true);
		order2.setReady(true);

		System.out.println("--- Status Messages ---");
		System.out.println("Guest1: " + guest1.getStatusMessage());
		System.out.println("Guest2: " + guest2.getStatusMessage());
		System.out.println("Cindhuri: " + order1.getStatusMessage());
		System.out.println("Jimmy: " + order2.getStatusMessage());
		System.out.println("Noah: " + order3.getStatusMessage());

		System.out.println("\n--- Order Totals ---");
		System.out.println(order1.getOrderTotal());
		System.out.println(order2.getOrderTotal());
		System.out.println(order3.getOrderTotal());

		System.out.println("\n-- Display All Orders ---");
		guest1.display();
		System.out.println();
		guest2.display();
		System.out.println();
		order1.display();
		System.out.println();
		order2.display();
		System.out.println();
		order3.display();

	}

}
