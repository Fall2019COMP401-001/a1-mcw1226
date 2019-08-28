package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int numOfGroceries = scan.nextInt();
		String[] groceryNames = new String[numOfGroceries];
		double[] prices = new double[numOfGroceries];
		int[] itemCounter = new int[numOfGroceries];
		int[] custCounter = new int[numOfGroceries];

		for (int h = 0; h < numOfGroceries; h++ ) {
			groceryNames[h] = scan.next();
			prices[h] = scan.nextDouble(); 
		}
		int numOfCustomers = scan.nextInt();

		String[] firstNames = new String[numOfCustomers];
		String[] lastNames = new String[numOfCustomers];

		for (int h = 0; h < numOfCustomers; h++) {
			firstNames[h] = scan.next();
			lastNames[h] = scan.next();
			boolean[] dublicateTest = new boolean[numOfGroceries];
			int itemNums = scan.nextInt();

			for (int j = 0; j < itemNums; j++) {
				int quantity = scan.nextInt();
				String item = scan.next();

				for (int i = 0; i < numOfGroceries; i++) {
					if (groceryNames[i].equals(item)) {
						if (!dublicateTest[i]) {
							itemCounter[i] += quantity; 
							custCounter[i] += 1;
							dublicateTest[i] = true;
						} else {
							itemCounter[i] += quantity; 
						}
					}
				}
			}
		}
		for (int b = 0; b < numOfGroceries; b ++) {
			if (custCounter[b] == 0) {
				System.out.println("No customers bought " + groceryNames[b]);
			} else {
				System.out.println(custCounter[b] + " customers bought " + itemCounter[b] + " " + groceryNames[b]);
			}
		}
	}
}
