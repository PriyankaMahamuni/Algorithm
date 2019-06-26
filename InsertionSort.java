/**
 * @purpose  	: Insertion sort of integers.  
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 20.05.19
 */

package com.bridgeit.algorithm;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=Util.getArray();
		arr=Util.integerSort(arr);
		Util.integerSortElements(arr);
	}

}
