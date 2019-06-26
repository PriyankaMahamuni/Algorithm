/**
 * @purpose  	: To calculate the monthly payments.  
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 23.05.19
 */

package com.bridgeit.algorithm;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount,year;
		float interest;
		amount=Integer.parseInt(args[0]);
		year=Integer.parseInt(args[1]);
		interest=Float.parseFloat(args[2]);
		Util.monthlyPayment(amount, year, interest);
	}

}
