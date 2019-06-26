/**
 * @purpose  	: To print the Sorted List using insertion sort.  
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 21.05.19
 */

package com.bridgeit.algorithm;
import java.util.Scanner;

public class InsertionSortStringList {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string list to be sorted");
		String list[]=s.nextLine().split(" ");
		for(int i=0;i<list.length;i++)
		{
			for(int j=i+1;j<list.length;j++)
			{
				if(list[i].compareTo(list[j])>0)
				{
					String temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
			}
		}
	for(int i=0;i<list.length;i++)
	{
		System.out.println(list[i]);
	}
	
	
	}

}
