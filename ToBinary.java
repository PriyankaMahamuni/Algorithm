/**
 * @purpose  	: To that outputs the binary (base 2) representation of the decimal number typed as the input.  
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 23.05.19
 */

package com.bridgeit.algorithm;
import java.util.*;
public class ToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Decimal Value to Convert into Binary Number : ");
		number=sc.nextInt();
		ArrayList<Integer>list=new ArrayList<Integer>();
		list=Util.toBinary(number);
	}

}
