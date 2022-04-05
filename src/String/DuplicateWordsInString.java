package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {
	
	public static void main(String[] args) {
		
		findDuplicateWords("Hey java is java and best language is java");
		findDuplicateWords("hi hi hi");
	}
	
	public static void findDuplicateWords(String inputString) {
		
//		split
		String [] words = inputString.split(" ");
		
//		create one hashmap :
		Map<String , Integer> wordscount = new HashMap<String, Integer>();
		
//		to check each words in given array:
		for(String word : words) {
			
			if(wordscount.containsKey(word)) {
				wordscount.put(word, wordscount.get(word)+1);
			}
			else {
				wordscount.put(word, 1);
			}
		}
		
//		extracting the all the keys of map- wordscount
		Set<String> wordsInstring = wordscount.keySet();
		
//		loop through all the words in wordscount
		for(String word : wordsInstring) {
			if(wordscount.get(word)>1) {
				System.out.println(word+" "+wordscount.get(word));
			}
		}
	
	}

}
