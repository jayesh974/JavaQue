package Questions_ByNaveen;

public class PalindromeNumber {
	
	public static void isPalindromeNumber(int num) {
		
		int temp=num;
		int rev=0; 
		int rem;
		while(temp!=0) {
			
			rem = temp%10;
			rev = rev*10 + rem;
			temp = temp/10;
		}
		
		if(num==rev) {
			System.out.println("The number is pallindrom no");
		}
		else
		{
			System.out.println("The number is not palindrom no");
		}
			
	}
	
	public static void main(String[] args) {
		
		
		isPalindromeNumber(122);
	}

}
