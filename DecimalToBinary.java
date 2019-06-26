/**
 * @purpose  	: To convert decimal to binary.  
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 22.05.19
 */

package com.bridgeit.algorithm;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number to Convert into Binary : ");
		number=sc.nextInt();
		Util.toBinary(number);
	}

}
