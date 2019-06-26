/**
 * @purpose  	: Binary integer search. 
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 20.05.19
 */

package com.bridgeit.algorithm;

public class BinaryIntegerSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=Util.getArray();
		int sortarray[]=Util.integerSort(array);
		System.out.print("Enter element to search : ");
		int element=Util.getNumber();
		int result=Util.binaryIntegerSearch(sortarray,element);
		System.out.println(result);
		if(result==-1)
		{
			System.out.println("Element is not found");
		}
		else
		{
			System.out.println("Element is found at"+result+"Position");
		}
	}

}
