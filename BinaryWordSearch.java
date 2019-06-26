/**
 * @purpose  	: Binary String word search.  
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 20.05.19
 */

package com.bridgeit.algorithm;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryWordSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\DELL\\eclipse-workspace\\Task\\src\\demo.txt");
	    
	    try
		{
	    	Scanner s=new Scanner(f);//to read words from  file
	    	String list=s.nextLine();
	    	String wordlist[]=list.split(",");
	    	Arrays.sort(wordlist);
	    	System.out.println("Enter the string to be searched");
	    	Scanner t=new Scanner(System.in);
	    	String word=t.nextLine();
	    	int hi=wordlist.length-1;
	    	if(wordlist.length!=0)
	     	{
	    	 	int result=Util.binarySearch(wordlist,word,0,hi);
	    	 	if(result==-1)
	    	 	{	
	    	 		System.out.println("The word not found");
	    	 	}
	    	 	else
	    	 	{
	    	 		System.out.println("The word found at:"+ result + "position");
	    	 	}
	    
	     	}
		}catch(Exception e)
		{
			System.out.println("File not found");
		}
		
	}
		
}


