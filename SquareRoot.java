/**
 * @purpose  	: To compute the square root of a nonnegative number c given in the input using Newton's method.  
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 23.05.19
 */

package com.bridgeit.algorithm;
import java.util.*;
public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int c;
		double t;
		System.out.print("Enter Number to find square root : ");
		c=sc.nextInt();
		t=c;
		double epsilon=1e-15;
		while(Math.abs(t-c/t)>(epsilon*t))
		{
			t=(c/t+t)/2.0;
		}
		System.out.println("Square Root of "+c+" : "+t);
	}

}
