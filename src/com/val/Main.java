package com.val;

public class Main {

	public static void main(String[] args) {

		calculateCharges(9);

	}

	public static void calculateCharges(double totalHours) {

		double minimumFee = 2.0;
		double additionalFee = 0.5;
		double maxCharge = 10.00;
		double totalFee = 0;


		if (totalHours <= 3) {
			System.out.println("Total fee for " + totalHours + " hours is: " + minimumFee);
		} else if (totalHours > 3 && totalHours < 24) {
			totalFee = minimumFee + ((totalHours - 3) * additionalFee);
			System.out.println("Total fee for " + totalHours + " hours is: " + totalFee);
		} else {
			System.out.println("Total fee for " + totalHours + " hours is: " + maxCharge);
		}

	}

}
