package QUESTION_SET;

public class CountChracterOccurence {
	
	public static void main(String[] args) {
		
		
		String str = "Java Programming Selenium Javaa" ;
		
		int total_count = str.length();
		
		String nstr = str.replace("a", "");
		
		int count = nstr.length();
		
		System.out.println("Number of Occurance of a is :"+(total_count - count));
		
	}

}
