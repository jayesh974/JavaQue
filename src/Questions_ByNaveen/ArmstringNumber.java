package Questions_ByNaveen;

public class ArmstringNumber {
	
	public static void isArmstrongNumber(int num) {
		
		int cube = 0;
		int rem;
		int temp;
		
		temp=num;
		
		while(temp!=0) {
			
			rem = temp%10;
			temp = temp/10;
			cube = cube+(rem*rem*rem);
		}
		if(num==cube) {
			System.out.println("The number is armstrong no");
		}
		else {
			System.out.println("The is not armstrong no");
		}
	}
	
	public static void main(String[] args) {
		
		isArmstrongNumber(153);
		isArmstrongNumber(173);
		isArmstrongNumber(371);		
	}
	
}
