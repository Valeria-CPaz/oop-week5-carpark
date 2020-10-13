package com.val;

public class Main {

	public static void main(String[] args) {

		calculateCharges(23);

	}

	public static void calculateCharges(double totalHours) {

		double minimumFee = 2.0;
		double additionalFee = 0.5;
		double maxCharge = 10.00;
		double totalFee = 0;


		if (totalHours <= 3) {
			System.out.println("Total fee for " + totalHours + " hours is: " + minimumFee + " euros.");
		} else if (totalHours > 3 && totalHours < 19) {
			totalFee = minimumFee + ((totalHours - 3) * additionalFee);
			System.out.println("Total fee for " + totalHours + " hours is: " + totalFee + " euros.");
		} else {
			System.out.println("Total fee for " + totalHours + " hours is: " + maxCharge + " euros.");
		}

	}

}
