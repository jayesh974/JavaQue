package QUESTION_SET;

public class Swapping2Numbers {
	
	public static void main(String[] args) {
		
	int a= 10;
	int b = 20;
	
//	Logic 1 - Using Third variables
/*	int t;
	t=a;
	a=b;
	b=t;
*/	
//	Logic 2 - use + and - without using third variables
/*	
	a=a+b;  // 10+20=30
	b=a-b;  //30-20=10
	a=a-b;  // 30-10=20
*/	
//	Logic 3 - use * and / without usiing third variables
/*	
	a=a*b;   // 10*20 = 200
	b=a/b;   // 200/20=10
	a=a/b;   // 200/10 = 20
*/	
//	Logic 4 - bitwise XOR (^)
/*	
	a=a^b;   //10^20=30
	b=a^b;   // 30^20=10
	a=a^b;   // 30^10=20
*/	
//	Logic 5 - Single Statement
	// a =10    b=20
	
	b= a+b-(a=b);
	
	System.out.println("After swapping values are "+a+" "+b);
		
	}

}
