/**
 * @purpose  	: Bubble sort of integers.  
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 20.05.19
 */

package com.bridgeit.algorithm;

public class BubbleIntegerSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=Util.getArray();
		int sortArray[]=Util.BubbleIntegerSort(array);
		Util.integerSortElements(sortArray);
	}

}
