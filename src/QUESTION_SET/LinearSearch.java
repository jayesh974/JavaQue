package QUESTION_SET;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int search_ele = sc.nextInt();
		
		int a [] = {10,20,30,40,50,60};

		boolean flag = false;
		
		for(int i=0; i<a.length; i++)
		{
			if(search_ele == a[i])
			{
				System.out.println("Elelment found in array at "+i);
				flag = true;
				break;
			}
		}
		
		if(flag = false)
		{
			System.out.println("Element Not found in Array");
		}
		
		
		
		
		
	}

}
