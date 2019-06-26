/**
 * @purpose  	: Two Strings are Anagram or not.
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 20.05.19
 */

package com.bridgeit.algorithm;

import java.util.Scanner;

public class AnagramString  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,str1;
		char temp;
		System.out.println("Enter First String :");
		str=Util.getString();
		System.out.println("Enter Second String :");
		str1=Util.getString();
		if(Util.anagramStrings(str, str1))
		{
			System.out.println("Both String are Anagram");
		}
		else
		{
			System.out.println("Stings are not Anagram");
		}
	
	}

}
