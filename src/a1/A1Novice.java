package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Your code follows here.

		int numOfCustomers = scan.nextInt();
		for (int i = 0; i < numOfCustomers; i++) {
			String names = scan.next();
			String lastNames = scan.next();
			int groceryItems = scan.nextInt();
			double total = 0.0;
			for (int j = 0; j < groceryItems; j++) {
				int numOfItem = scan.nextInt();
				scan.next();
				double price = scan.nextDouble();
				price = price * numOfItem;
				total += price;  	
			}
			System.out.println(names.charAt(0) + ". " + lastNames + ": " + String.format("%.2f", total));
		}
		
	}
}
