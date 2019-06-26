/**
 * @purpose  	: To print one the number of minimum Note needed to give the change and second list of Rs Notes that would given in the Change.  
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 22.05.19
 */

package com.bridgeit.algorithm;
import java.util.*;
public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amountto be Change : ");
		int amount=sc.nextInt();
		Util.countCurrency(amount);
		
	}

}
