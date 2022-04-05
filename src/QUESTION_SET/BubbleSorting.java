package QUESTION_SET;

import java.util.Arrays;

public class BubbleSorting {
	
	public static void main(String[] args) {
		
		int a [] = {50,4,65,15,7,46};
		
		System.out.println("Array before sorting :" +Arrays.toString(a));
		
		int n = a.length;
		int temp;
		
		for(int i=0 ; i<n-1 ; i++)       // 1st for loop for Number of passes
		{
			for(int j=0 ;j<n-1 ; j++)    //  Iteration in each pass
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Array After sorting :" +Arrays.toString(a));
		
			
	}

}
