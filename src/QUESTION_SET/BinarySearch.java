package QUESTION_SET;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
//	Approach : 1 
		int a[] = {1,2,3,4,5,6,7,8,9,10};   // should be in sorted order
		
//		int key = 5 ;
		int l=0;
		int h=a.length-1;		
		boolean flag = false;
		
		while(l<=h)
		{
			int m = (l+h)/2 ;
			
			if(key==a[m])
			{
				System.out.println("Element Found..");
				flag = true;
				break;	
			}
			
			if(key>a[m])
			{
				l=a[m]+1;
			}
			
			if(key<a[m])
			{
				h=a[m]-1;		
			}		
		}
		
		if(flag == false)
		{
			System.out.println("Element is not Found...");
		}
		
		
		
//	Approach : 2   Arrays.binarySearch()  --> return index value if element is not present then return the some negative value 
		
		System.out.println(Arrays.binarySearch(a,key));
		
	}

}
