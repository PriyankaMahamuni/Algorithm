/**
 * @purpose  	: To print the Sorted List using bubble sort.  
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 21.05.19
 */

package com.bridgeit.algorithm;
import java.util.ArrayList;
import java.util.*;

public class BubbleSortIntegerList {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=s.nextInt();
		int list[]=new int[n];
		for(int i=0;i<n;i++)
		{
			list[i]=s.nextInt();
		}
		for(int i=0;i<list.length;i++)
		{
			int flag=0;
			for(int j=0;j<list.length-1-i;j++)
			{
				if(list[j]>list[j+1])
				{
					int temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				flag=1;
				}
			}
		if(flag==0)
		{
			break;
		}
		}
for(int i=0;i<list.length;i++)
{
	System.out.println(list[i]);
}
	}

}
