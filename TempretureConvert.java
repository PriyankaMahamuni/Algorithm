/**
 * @purpose  	: given the temperature in fahrenheit as input outputs the temperature in Celsius or viceversa.  
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 22.05.19
 */

package com.bridgeit.algorithm;
import java.util.*;
public class TempretureConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int fahrenheit,celsius;
		System.out.print("Enter Tempreture in Fahrenheit : ");
		fahrenheit=sc.nextInt();
		System.out.print("\nTempreture in Celsius : ");
		celsius=sc.nextInt();
		Util.tempretureConversion(fahrenheit,celsius);
	}
}
