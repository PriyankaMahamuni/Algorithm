/**
 * @purpose  	: To print the result if the word is found or not using binary search.  
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 21.05.19
 */

package com.bridgeit.algorithm;
import java.io.File;
import java.util.Arrays;
import java.util.*;

public class BinarySearchWordList {

	public static void main(String[] args) {
    File f=new File("C:\\Users\\DELL\\eclipse-workspace\\Task\\src\\demo.txt");
    
    try
	{
    	Scanner s=new Scanner(f);//to read words from  file
    	//while(s.hasNext())
    
    String list=s.nextLine();
    String wordlist[]=list.split(",");
      Arrays.sort(wordlist);
	System.out.println("Enter the string to be searched");
	Scanner t=new Scanner(System.in);
	String word=t.nextLine();
	int hi=wordlist.length-1;
     if(wordlist.length!=0)
     {
    	 int result=binarySearch(wordlist,word,0,hi);
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
	
	public static int binarySearch(String wordlist[],String word,int li,int hi)
	{
		int mi=Math.round(li+hi)/2;
		while(li<=hi)
		{
			int res=word.compareTo(wordlist[mi]);
			if(res==0)
			{
				return mi;
			}
			else if(res>0)
			{
				li=mi+1;
			}
			else
			{
				hi=mi-1;
			}
			mi=Math.round(li+hi)/2;
		}
		return -1;
	}
}
