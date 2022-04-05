package QUESTION_SET;

import java.util.Scanner;

public class ReverseEachWordsInAString {

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String[] words = str.split(" ");

		String reverseString = "";
		for (String w : words) 
		{
			String reverseWord = "";
			for (int i=w.length()-1; i>=0 ; i--) 
			{
				reverseWord = reverseWord + w.charAt(i);
				
			}
			
			reverseString = reverseString + reverseWord +" ";   // space is must
		}
		
	System.out.println(reverseString);	
	
//	second Approach
	String str2 = sc.nextLine();
	
	String [] words2 = str.split("\\s");
	
	String reverseString2 = "";
	
	for(String w2 : words2)
	{
		StringBuilder sb = new StringBuilder(w2);
		StringBuilder rev2 = sb.reverse();
		
		reverseString2 = reverseString2 + rev2.toString();
	}
	
	System.out.println(reverseString2);
	

	}

}
