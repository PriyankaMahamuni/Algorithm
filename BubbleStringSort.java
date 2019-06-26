/**
 * @purpose  	: Bubble sort of string.  
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 20.05.19
 */

package com.bridgeit.algorithm;

public class BubbleStringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]={"Pune","Mumbai","Hi","bye"};
		String sort[]=Util.BubbleStringSort(str);
		Util.stringSortElements(sort);
	}

}
