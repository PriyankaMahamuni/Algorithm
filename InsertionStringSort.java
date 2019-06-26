/**
 * @purpose  	: Insertion sort of string.  
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 20.05.19
 */

package com.bridgeit.algorithm;

public class InsertionStringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]={"Boll","Bal","Sunday","Pink","Gunga"};
		String sort[]=Util.insertionStringSort(str);
		Util.stringSortElements(sort);
	}

}
