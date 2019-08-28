package a1;

import java.util.Scanner;
// started August 25, 2019
public class A1Adept {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Your code follows here.

		int numOfItems = scan.nextInt();
		String[] groceries = new String[numOfItems];
		double[] prices = new double[numOfItems];
		
		for (int i = 0; i < numOfItems; i++ ) {
			groceries[i] = scan.next();
			prices[i] = scan.nextDouble(); 
		}
		
		int numberOfCustomers = scan.nextInt();
		String[] firstNames = new String[numberOfCustomers];
		String[] lastNames = new String[numberOfCustomers];
		double[] totals = new double[numberOfCustomers];
		double sum = 0;
		// assigns names to respective arrs
		for (int x = 0; x < numberOfCustomers; x++) {
			firstNames[x] = scan.next();
			lastNames[x] = scan.next();
			
			int itemNums = scan.nextInt();
			double total = 0;
			
			for (int i = 0; i < itemNums; i++) {
				int quantity = scan.nextInt();
				String nameOfItem = scan.next();
				
				//test to find total amt spent
				for (int n = 0; n < numOfItems; n++) {
					if (groceries[n].equals(nameOfItem)) {
						total += prices[n] * quantity; 
					}
	
				}
			totals[x] = total;
			}
		}
		// changing total value for the total arr
		for (int d = 0; d < totals.length; d++) {
			sum += totals[d];
		}

		double highestTotal = totals[0];
		int highestCustomer = 0; 
		double leastTotal = totals[0];
		int leatCustomer = 0;
		//finding highest and lowest total and avg.
		for (int c = 0; c < totals.length; c++) {
			if (highestTotal < totals[c]) {
				highestTotal = totals[c];
				highestCustomer = c;
			}if (leastTotal > totals[c]) {
				leastTotal = totals[c];
				leatCustomer = c;
			}
		}

		double avg = (sum)/totals.length;
		
		System.out.println("Biggest: " + firstNames[highestCustomer] + " " + lastNames[highestCustomer] + " (" + String.format("%.2f", highestTotal) + ")");
		System.out.println("Smallest: " + firstNames[leatCustomer] + " " + lastNames[leatCustomer] + " (" + String.format("%.2f", leastTotal) + ")");
		System.out.println("Average: " + String.format("%.2f", avg));
	}
}
