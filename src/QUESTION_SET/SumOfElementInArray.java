package QUESTION_SET;

public class SumOfElementInArray {

	public static void main(String[] args) {

		int a[] = { 5, 6, 4, 2, 1, 8 };

		int sum = 0;
// 1. By using for loop
	/*	for (int i = 0; i <= a.length - 1; i++) // a.lengh -1 = 4
		{

			sum = sum + a[i];
		}

		System.out.println("sum of elelment of array "+sum);
*/
//	2. using enhanced for loop
		
		for(int value : a)
		{
			sum = sum + value ;
		}
		
		System.out.println("sum of elelment of array is "+sum);
   }
}
