package String;

import java.util.Base64;

public class Encoding_String {
	
	public static void main(String[] args) {
		
		String encodeString = Base64.getEncoder().encodeToString("jayeshgangurde".getBytes());
		System.out.println(encodeString);
		
		String  decodeString = new String(Base64.getDecoder().decode("amF5ZXNoZ2FuZ3VyZGU=".getBytes()));
		System.out.println(decodeString);
	}

}
