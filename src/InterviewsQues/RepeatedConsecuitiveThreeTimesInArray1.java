package InterviewsQues;

public class RepeatedConsecuitiveThreeTimesInArray1 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 2, 2, 3, 4, 5, 6, 6, 6, 7, 8 , 8, 8};
		
		System.out.println("number(s) that is(are) repeated consecutively three times: ");

		for (int i = 0; i < a.length-2; i++) {

			for (int j = i + 1; j < a.length-1; j++) {

				for (int k = i + 2; j < a.length; j++) {

					if (a[i] == a[j] && (i != j) && a[j] == a[k] && (j != k)) {

						System.out.println(a[k] + " ");
					}
				}
			}

		}
	}
}
