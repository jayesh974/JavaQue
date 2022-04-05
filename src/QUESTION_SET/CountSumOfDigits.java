package QUESTION_SET;

public class CountSumOfDigits {
	
	public static void main(String[] args) {
		
		int num = 1234567;		
		int sum =0;
		
		while(num>0)
		{
			int rem = num%10;    // extract the  last digit
			
			 sum = sum + rem;		
			 
			 num = num/10;       // eliminate the last digit
		} 
		
		System.out.println(" Sum of Digits of Number is :"+sum);
		
		
	}

}
