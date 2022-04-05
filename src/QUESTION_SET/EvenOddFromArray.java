package QUESTION_SET;

public class EvenOddFromArray {

	public static void main(String[] args) {

		int a[] = { 5, 6, 4, 2, 1, 8, 3 };
/*		
//  1. using for loop
		System.out.println("Even numbers in array ..........");
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] % 2 == 0) 
			{
				System.out.println(a[i]);
			}
		}

		System.out.println("Odd numbers in array ..........");
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] % 2 != 0)
			{
				System.out.println(a[i]);
			}
		}
*/		
//		2 . using enhanced for loop
		System.out.println("Even numbers in array ..........");
		for(int value : a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
		}

		
		System.out.println("Odd numbers in array ..........");
		for(int value : a)
		{
			if(value%2!=0)
			{
				System.out.println(value);
			}
		}
	}

}
