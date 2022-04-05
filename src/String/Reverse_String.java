package String;

public class Reverse_String {
	
	public static void main(String[] args) {
		
		String str = "ABCD";
		
		String rev = " ";
		int leng = str.length();
/*		
//		1. using string concatenation
		
		for(int i=leng-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
*/	
		/*
//		2. using character array
		
		char a[] = str.toCharArray();
		
		int lng = a.length;
		
		for(int i=lng-1 ; i>=0; i--)
		{
			rev = rev + a[i];
		}
		System.out.println(rev);
		*/
		
//		 3. using String Buffer Class
		
		StringBuffer sbf = new StringBuffer(str);
		
		System.out.println(sbf.reverse());
		
		
	}

}
