package QUESTION_SET;

public class Count_No_Of_Digits {
	
	public static void main(String[] args) {
		
		int num = 12345678;
		
		int count = 0;
		
		while(num>0)
		{
			num = num/10;   // To eliminate the last digit in every iteration
			count++;
		}
		
		System.out.println(count);
		
	}

}
