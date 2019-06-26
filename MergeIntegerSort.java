/**
 * @purpose  	: To print the Sorted List using merge sort.  
 * @author 		: Priyanka Mahamuni
 * @version 	: 1.0
 * @since 		: 21.05.19
 */
package com.bridgeit.algorithm;

public class MergeIntegerSort {
				int []array;
				int []tempArray;
				int length;
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int [] inputArray= {48,36,13,52,148,56,35};
				MergeIntegerSort sort=new MergeIntegerSort();
				sort.sort(inputArray);
				for(int i=0;i<inputArray.length;i++)
				{
					System.out.println(inputArray[i]);
				}
			}
			public void sort(int inputarr[])
			{
				this.array=inputarr;
				this.length=inputarr.length;
				this.tempArray=new int[length];
				devideArray(0,(length-1));
			}
			public void devideArray(int lowerindex,int higherindex)
			{
				if(lowerindex<higherindex)
				{
					int middle=lowerindex+(higherindex-lowerindex)/2;
					devideArray(lowerindex,middle);//sort left hand side array
					devideArray(middle+1,higherindex);//sort right hand side array
					mergeArray(lowerindex,middle,higherindex);
				}
			}
			public void mergeArray(int lowerindex,int middle,int higherindex)
			{
				for(int i=lowerindex;i<=higherindex;i++)
				{
					tempArray[i]=array[i];
				}
				int i=lowerindex;
				int j=middle+1;
				int k=lowerindex;
				while(i<=middle && j<=higherindex)
				{
					if(tempArray[i]<=tempArray[j])
					{
						array[k]=tempArray[i];
						i++;
					}
					else
					{
						array[k]=tempArray[j];
						j++;
					}
					k++;
				}
				while(i<=middle)
				{
					array[k]=tempArray[i];
					k++;
					i++;
				}
			
			}
}
