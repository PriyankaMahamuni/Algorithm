/**
 * @purpose  	: Binary String search.  
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 20.05.19
 */

package com.bridgeit.algorithm;
import java.util.*;
public class BinaryStringSearch {

	public void BinarySearch()
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter Sentence : ");
		str=sc.nextLine();
		System.out.println("Enter word to search : ");
		String word=sc.next();
		String ch[]=str.split(" ");
		int res=Util.binaryStringSearch(ch, word);
		if(res==-1)
		{
			System.out.println("word is not found");
		}
		else
		{
			System.out.println("Word is found at "+res+" Position");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BinaryStringSearch obj=new BinaryStringSearch();
		 obj.BinarySearch();
	}

}
