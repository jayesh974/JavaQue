package QUESTION_SET;

public class CountEvenAndOddDIgits {
	
	public static void main(String[] args) {
		
		int num = 12345678;
		
		int even_count = 0;
		int odd_count = 0;
		
		while(num>0)
		{
			int rem = num%10;
			
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			
			num = num/10;
		}
		
		System.out.println("Number of even no "+even_count);
		System.out.println("Number of odd no "+odd_count);
	}

}
