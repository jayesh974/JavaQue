package String;

public class String_Concatanation {
	
	public static void main(String[] args) {
		
//		I am an UPSC aspirant and want to become a IAS officer
		
		String a = "UPSC";
		String b = "want";
		String c = "IAS";
		
		System.out.println("I am an "+a+" aspirant and "+b+" to become an "+c+" officer");
		
		System.out.println(String.format("I am an %s aspirant and %s to become an %s officer", a,b,c));
		
	}

}
