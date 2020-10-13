package com.val;

public class Main {

    public static void main(String[] args) {


    }

    public static double calculateCharges (double minimumFee, double additionalFee, double maxCharge) {

		minimumFee = 2.0;
		additionalFee = 0.5;
		maxCharge = 10.00;
		double totalHours = 0;
		double totalFee = 0;

		if (totalHours <= 3){
			System.out.println(minimumFee);
		} else if (totalHours > 3 && totalHours < 24){
			totalFee = minimumFee + ((totalHours - 3) * additionalFee);
		} else {
			System.out.println(maxCharge);
		}


	}
}
