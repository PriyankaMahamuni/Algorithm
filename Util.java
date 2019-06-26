package com.bridgeit.algorithm;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class Util {
	/*****************************************************************************************************

	 *  @method 		: getString,getNumber
	 *  @description 	: take string or number
	 * 	@Param			: none
	 * 	@return 		: string value or integer value
	 
	 *****************************************************************************************************/	
	static Scanner scannerObject=new  Scanner(System.in);
	public static String getString()
	{
		return scannerObject.next();
	}
	public static int getNumber()
	{
		return scannerObject.nextInt();
	}
	public static String sort(String str)
	{
		char[]ch=str.toCharArray();
		char temp;
		String sortString="";
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]<ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			sortString=sortString+ch[i];
		}
		return sortString;
	}
	/*****************************************************************************************************

	 *  @method 		: anagramStrings
	 *  @description 	: this will return boolean value 
	 * 	@Param			: stringOne,stringTwo
	 * 	@return 		: status
	 
	 *****************************************************************************************************/	
	public static boolean anagramStrings(String stringOne,String stringTwo)
	{
		String sort1 = Util.sort(stringOne);
		String sort2 = Util.sort(stringTwo);
		//System.out.println("Sorted String : "+sort1);
		//System.out.println("Sorted String : "+sort2);
		boolean status=sort1.equals(sort2);
		return status;
	}
	/*****************************************************************************************************

	 *  @method 		: prime
	 *  @description 	: it is used to get prime numbers between 0 to 1000 range
	 * 	@Param			: none
	 * 	@return 		: none
	 
	 *****************************************************************************************************/	
	public static void Prime()
	{
		int startindex=0,endindex=1000,i,j,flag=0;
		System.out.println("Prime Numbers Between 0 to 1000 : ");
		for(i=0;i<endindex;i++)
		{
			flag=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				System.out.print(i+"\t");
			}
		}
	}
	/*****************************************************************************************************

	 *  @method 		: primeAnagramPalindrome
	 *  @description 	: to check prime numbers are palindrome and anagram 
	 * 	@Param			: none
	 * 	@return 		: none
	 
	 *****************************************************************************************************/	
	public static void PrimeAnagramPalindrome()
	{
		int startindex=0,endindex=1000,i,j,flag=0,no,rem,p=0;
		System.out.println("Prime Palindrome Numbers : ");
		for(i=1;i<endindex;i++)
		{
			flag=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					flag=1;
				}
			}
			if(flag==0)
			{
				no=i;
				while(no>0)
				{
					rem=no%10;
					p=p*10+rem;
					no=no/10;
				}
				if(i==p)
				{
					System.out.println(p);
				}
				p=0;
				
			}
		}
		
	}
	/*****************************************************************************************************

	 *  @method 		: getArray,getStringArray
	 *  @description 	: getArray : to provide integer array
	 *  				  getStringArray - to provide String array
	 * 	@Param			: none
	 * 	@return 		: array
	 
	 *****************************************************************************************************/	
	public static int[] getArray() {
		int index;
		Scanner sc=new Scanner(System.in);
		System.out.print("How many Elements You want in array : ");
		index=sc.nextInt();
		System.out.println("\nEnter Array Elements : ");
		int arr[]=new int[index];
		for(int i=0;i<index;i++)
		{
			arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static String [] getStringArray()
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.print("Enter Sentence : ");
		str=sc.nextLine();
		String ch[]=str.split(" ");
		return ch;
	}
	/*****************************************************************************************************

	 *  @method 		: integerSort
	 *  @description 	: to sort elements by using insertion sort
	 * 	@Param			: array
	 * 	@return 		: array
	 
	 *****************************************************************************************************/	
	public static int[] integerSort(int arr[])
	{
		int temp,j;
		for(int i=0;i<arr.length;i++)
		{
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp)
			{
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		return arr;
	}
	/*****************************************************************************************************

	 *  @method 		: binaryIntegerSearch
	 *  @description 	: searching element using binary search
	 * 	@Param			: array & element
	 * 	@return 		: integer value
	 
	 *****************************************************************************************************/	
	public static int binaryIntegerSearch(int arr[],int value)
	{
		int limit=arr.length;
		int startindex,endindex,mid;
		startindex=0;
		endindex=limit-1;
		mid=(int) Math.floor((startindex+endindex)/2);
		while(startindex<=endindex)
		{
				System.out.println(mid);
				if(mid>value)
				{
					
					endindex=mid-1;	
				}
				else if(arr[mid]==value)
				{
					return mid;
				}
				else if(mid<value)
				{
					startindex=mid+1;
				}
				mid=(startindex+endindex)/2;
		}
		return -1;
	}
	/*****************************************************************************************************

	 *  @method 		: binaryStringSearch
	 *  @description 	: to search word using binary search
	 * 	@Param			: array,element
	 * 	@return 		: integer value
	 
	 *****************************************************************************************************/	
	public static int binaryStringSearch(String str[],String  ch)
	{
		int startindex=0,endindex=(str.length)-1,mid;
		mid=(startindex+endindex-1)/2;
		while(startindex<=endindex)
		{
			int result=ch.compareTo(str[mid]);
			if(result==0)
			{
				return mid;
			}
			else if(result>0)
			{
				startindex=mid+1;
			}
			else if(result<0)
			{
				endindex=mid-1;
			}
			mid=(startindex+endindex)/2;
		}
		return -1;
	}
	/*****************************************************************************************************

	 *  @method 		: insertionStringSort
	 *  @description 	: to sort elements using insertion sort
	 * 	@Param			: array
	 * 	@return 		: array
	 
	 *****************************************************************************************************/	
	public static String[] insertionStringSort(String str[])
	{
		String temp="";
		int limit=str.length;
		for(int i=0;i<limit;i++)
		{
			for(int j=i+1;j<limit;j++)
			{
				if((str[i].compareToIgnoreCase(str[j]))>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		return str;
	}
	/*****************************************************************************************************

	 *  @method 		: bubbelStringSort
	 *  @description 	: to sort elements using bubble sort
	 * 	@Param			: array
	 * 	@return 		: array
	 
	 *****************************************************************************************************/	
	public static  int[] BubbleIntegerSort(int bubble[])
	{
		int limit,temp;
		limit=bubble.length;
		for(int i=0;i<limit;i++)
		{
			for(int j=0;j<limit;j++)
			{
				if(bubble[i]<bubble[j])
				{
					temp=bubble[i];
					bubble[i]=bubble[j];
					bubble[j]=temp;
				}
			}
		}
		return bubble;
		
	}
	/*****************************************************************************************************

	 *  @method 		: bubbleStringSort
	 *  @description 	: to sort elements using bubble sort
	 * 	@Param			: array
	 * 	@return 		: array
	 
	 *****************************************************************************************************/	
	public static String[] BubbleStringSort(String bubble[])
	{
		int limit;
		String temp;
		limit=bubble.length;
		for(int i=0;i<limit;i++)
		{
			for(int j=i+1;j<limit;j++)
			{
				if((bubble[i].compareToIgnoreCase(bubble[j]))>0)
				{
					temp=bubble[i];
					bubble[i]=bubble[j];
					bubble[j]=temp;
				}
			}
		}
		return bubble;
	}
	/*****************************************************************************************************

	 *  @method 		: binarySearch
	 *  @description 	: to search element using binary search
	 * 	@Param			: array
	 * 	@return 		: integer value
	 
	 *****************************************************************************************************/	
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
	/*****************************************************************************************************

	 *  @method 		: bubbleIntegerSort
	 *  @description 	: to sort elements using bubble sort
	 * 	@Param			: list
	 * 	@return 		: none
	 
	 *****************************************************************************************************/	
	public static void bubbleIntegerSort(int list[])
	{
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
	/*****************************************************************************************************

	 *  @method 		: insertionSortElements
	 *  @description 	: to display sorted elements
	 * 	@Param			: array
	 * 	@return 		: none
	 
	 *****************************************************************************************************/	
	public static void integerSortElements(int sort[])
	{
		System.out.println("Sorted Integer Array : ");
		for(int i=0;i<sort.length;i++)
		{
			System.out.println(sort[i]);
		}
	}
	public static void stringSortElements(String sort[])
	{
		System.out.println("Sorted String Array : ");
		for(int i=0;i<sort.length;i++)
		{
			System.out.println(sort[i]);
		}
	}
	/*****************************************************************************************************

	 *  @method 		: countCurrrency
	 *  @description 	: to display minimum numbers of notes to change
	 * 	@Param			: amount
	 * 	@return 		: none
	 
	 *****************************************************************************************************/	
	public static void countCurrency(int amount)
	{
		int currency[]= {1000,500,100,50,20,10,5,2,1};
		int count=0;
		int tempCurrency[]= new int[currency.length];
		for(int i=0;i<currency.length;i++)
		{
			if(amount>=currency[i])
			{
				tempCurrency[i]=amount/currency[i];
				amount=amount-tempCurrency[i]*currency[i];
				count++;
			}
		}
		System.out.println("Minimum No. of Notes to be return : "+count);
		System.out.println("Notes to be change : ");
		for(int i=0;i<currency.length;i++)
		{
			if(tempCurrency[i]!=0)
			{
				System.out.print(currency[i]+" : "+tempCurrency[i]+"\n");
	            		}
		}
	}
	/*****************************************************************************************************

	 *  @method 		: dayOfWeek
	 *  @description 	: to display in which week day falls
	 * 	@Param			: day,year,month
	 * 	@return 		: none
	 
	 *****************************************************************************************************/	
	public static void dayOfWeek(int day,int month,int year)
	{
				String days[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
				String months[]= {"Januvary","February","March","April","May","June","Jule","August","September","Octomber","November","December"};
				int y0,x,m0,d0;
				y0=year-(14-month)/12;
				x=y0+y0/4-y0/100+y0/400;
				m0=month+12*((14-month)/12)-2;
				d0=(day + x + 31*m0 / 12) % 7;
				for(int i=0;i<days.length;i++)
				{
					if(i==d0)
					{
						System.out.println("Day of this Date "+day+"/"+month+"/"+year+" : "+days[i]);
					}
				}
				for(int i=0;i<months.length;i++)
				{
					if(i==(month-1))
					{
						System.out.println("Month of this Date "+day+"/"+month+"/"+year+" : "+months[i]);
					}
				}
	}
	/*****************************************************************************************************

	 *  @method 		: tempretureConversion
	 *  @description 	: converting tempreture
	 * 	@Param			: tempFahren,tempcelsius
	 * 	@return 		: none
	 
	 *****************************************************************************************************/	
	public static void tempretureConversion(int tempFahren,int tempcelsius)
	{
		         int tempreture=(tempcelsius * 9/5) + 32;
				 int tempretureCelsius=((tempFahren-32) * 5/9) ;
				 System.out.print("Tempreture Fahrenheit to  Celsius : "+tempretureCelsius);
				 System.out.print("\nTempreture Celsius to Fahrenheit : "+tempFahren);
	}
	/*****************************************************************************************************

	 *  @method 		: monthlyPayment
	 *  @description 	: to calculate monthly payment
	 * 	@Param			: principleamount,noOfyear and interest
	 * 	@return 		: none
	 
	 *****************************************************************************************************/	
	public static void monthlyPayment(int PrincipalAmount,int NoOfYear,float Interest )
	{
		int n;
		int payment;
		float r;
		n=NoOfYear*12;
		r=(Interest/(12*100));
		payment=(int) ((PrincipalAmount*r)/(1-(Math.pow((1+r),(-n)))));
		System.out.println("Monthly Payment : "+payment);
	}
	/*****************************************************************************************************

	 *  @method 		: toBinary
	 *  @description 	: to convert decimal to binary
	 *  				  to swap elements
	 *                    to convert binary to decimal
	 * 	@Param			: number
	 * 	@return 		: list
	 
	 *****************************************************************************************************/	
	public static ArrayList<Integer> toBinary(int number)
	{
		 
		    ArrayList<Integer> array = new ArrayList<Integer>(); 
		    ArrayList<Integer> array1 = new ArrayList<Integer>();
		    int index,decimal=0,power=0;
		    System.out.print("Blocks for "+number+" in Binary form : "); 
		    while (number>0)  
		    { 
		    	array.add((int)number % 2); 
		        number = number/ 2; 
		    } 
		    array.add(array.size(), 0);
		    for (int i = array.size()-1; i >= 0; i--)  
		    { 
		    	int a=array.get(i);
		    	array1.add(a);
		       System.out.print(array.get(i)); 
		         
		    }  
		 	System.out.print("\nPower of 2 "+" : ");
		    for (int i = 0; i < array.size(); i++)  
		    { 
		        if (array.get(i) == 1)  
		        { 
		        	System.out.print(i+"\t"); 
		        	System.out.print(Math.pow(2, i));
		            if (i != array.size() - 1) 
		            	System.out.print(", "); 
		        } 
		    } 
		    System.out.print("\nArray2 : ");
		    for(int i=0;i<array1.size();i++)
		    {
		    	System.out.print(array1.get(i));
		    }
		    System.out.println("\nSwaped nibbles : ");
		    int i=0,j=4;
		    for(;j<array1.size();i++,j++)
		    {
		    	Collections.swap(array1, i, j);
		   
		    }
		    System.out.print(array1);
		    for(i=array1.size()-1,j=0;i>0;i--,j++)
		    {
		    	index=array1.get(i);
		    	power=(int)Math.pow(2, j);
		    	decimal= decimal+(index*power);
		    }
		    System.out.print("\nDecimal value : "+decimal);
		return array;
	}
	
}