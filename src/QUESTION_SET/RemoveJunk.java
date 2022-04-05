package QUESTION_SET;

public class RemoveJunk {
	
	public static void main(String[] args) {
		
		String s = "!@#$#%$#%$#%&^@& Selenuim Practice Question" ;
		
		String ns = s.replaceAll("[^a-zA-Z0-9]", "");  //^ - represent other than this
		
		System.out.println(ns);
		
		
		
	}

}
