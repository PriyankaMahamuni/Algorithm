/**
 * @purpose  	: To print elapsed time performance in descending order.  
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 21.05.19
 */

package com.bridgeit.algorithm;
import java.util.*;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class SearchSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Date Instant=new Date(System.currentTimeMillis());
		SimpleDateFormat date=new SimpleDateFormat("HH:mm:ss");
		String current=date.format(Instant);*/
		ArrayList<Long>list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		long current=System.currentTimeMillis();
		System.out.println("Current Time : "+current);
		
		
		/*    Binary Integer Search   */
		System.out.println("\nProgram of Binary Integer Search");
		int arr[]=Util.getArray();
		arr=Util.integerSort(arr);
		int result=Util.binaryIntegerSearch(arr,52);
		if(result==-1)
		{
			System.out.println("Element is not found");
		}
		else
		{
			System.out.println("Element is found at"+result+"Position");
		}
		long current1=System.currentTimeMillis();
		System.out.println("After Binary Search : "+ current1);
		long time=(current-current1);
		System.out.println("Elapsed Time : "+time);
		list.add(time);
		/*   End of Binary Integer Search  */
		
		/*   Binary String Search    */
		System.out.println("\nProgram of Binary String  Search");
		String str[]=Util.getStringArray();
		System.out.println("Enter word to search : ");
		String word=sc.next();
		int res=Util.binaryStringSearch(str, word);
		if(res==-1)
		{
			System.out.println("word is not found");
		}
		else
		{
			System.out.println("Word is found at "+res+" Position");
		}
		long current2=System.currentTimeMillis();
		time=(current1-current2);
		System.out.println("Elapsed Time : "+time);
		list.add(time);
		/*   End of Binary String Search    */
		
		
		/*		Insertion sort of Integer     */
		System.out.println("\nProgram of Insertion Integer Sort");
		int arr1[]=Util.getArray();
		arr1=Util.integerSort(arr1);
		Util.integerSortElements(arr1);
		long current3=System.currentTimeMillis();
		time=(current2-current3);
		System.out.println("Elapsed Time : "+time);
		list.add(time);
		/*      End of Insertion Sort         */
		
		/*		Insertion String Sort 		*/
		System.out.println("\nProgram of Insertion String  Sort");
		String string[]=Util.getStringArray();
		String sort[]=Util.insertionStringSort(string);
		Util.stringSortElements(sort);
		long current4=System.currentTimeMillis();
		time=(current3-current4);
		System.out.println("Elapsed Time : "+time);
		list.add(time);
		/* 		End of Insertion Sort		*/
		
		
		/*		Bubble Integer  Sort					*/
		System.out.println("\nProgram of Bubble Integer Sort");
		int array[]=Util.getArray();
		int sortArray[]=Util.BubbleIntegerSort(array);
		Util.integerSortElements(sortArray);
		long current5=System.currentTimeMillis();
		 time=(current4-current5);
		System.out.println("Elapsed Time : "+time);
		list.add(time);
		/*		End of Bubble Integer Sort			*/
		
		/*		Bubble String Sort				*/
		System.out.println("\nProgram of Bubble String Sort");
		String string1[]=Util.getStringArray();
		String sort1[]=Util.BubbleStringSort(string1);
		Util.stringSortElements(sort1);
		long current6=System.currentTimeMillis();
		time=(current5-current6);
		System.out.println("Elapsed Time : "+time);
		list.add(time);
		/*   	End String Bubble Sort			*/
		
		System.out.println("\nElpased Timing of all : "+list);
		Collections.sort(list); 
		System.out.println("Sorted Elapsed Timing of all : "+list);
		
	}

}
