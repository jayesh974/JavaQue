package InterviewsQues;

import java.util.HashMap;
import java.util.Map;

public class RepeatedConsecuitiveThreeTimesInArray2 {

	public static void main(String[] args) {
		
		int a[] = { 1, 2, 2, 2, 3, 4, 5, 6, 6, 6, 7, 8, 8, 8 };

		System.out.println("number(s) that is(are) repeated consecutively three times: ");

		Map<Integer, Integer> hm = new HashMap<>();

		for (int no : a) {

			Integer count = hm.get(no);

			if (count == null) {
				
				hm.put(no, 1);
				
			} 
			else {
				
				count = count + 1;
				hm.put(no, count);
			}
		}

		for (Map.Entry <Integer, Integer> entry : hm.entrySet()) {

			int val = entry.getValue();
			
			if (val >= 3) {
				
				System.out.println(entry.getKey());
			}
		}
	}
}
