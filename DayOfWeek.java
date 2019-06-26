/**
 * @purpose  	: that takes a date as input and prints the day of the week that date falls on.  
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 22.05.19
 */

package com.bridgeit.algorithm;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,d,y;
		d=Integer.parseInt(args[0]);
		m=Integer.parseInt(args[1]);
		y=Integer.parseInt(args[2]);
		Util.dayOfWeek(d,m,y);
	}

}
