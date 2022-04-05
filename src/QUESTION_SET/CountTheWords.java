package QUESTION_SET;

import java.util.Scanner;

public class CountTheWords {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int count = 1;   // should be 1
		for(int i=0 ;i<str.length()-1 ; i++)
		{
		
			
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		
		System.out.println("Number of Words in String are "+count);
		
	
	}

}
