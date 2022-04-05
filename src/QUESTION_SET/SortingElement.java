package QUESTION_SET;

import java.util.Arrays;
import java.util.Collections;

public class SortingElement {
	
	public static void main(String[] args) {
		
		int a [] = {50,4,65,15,7,46};
/*		
//    1. Aprroch 1  : Arrays.parallelSort()
 * 
		System.out.println("Array before sorting :" +Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array After sorting :" +Arrays.toString(a));
*/	
		/*
//		 2. Aprroch 2   :  Arrays.sort()
		System.out.println("Array before sorting :" +Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array After sorting :" +Arrays.toString(a));
*/	

//		Reverse Descending order    : Arrays.sort(b,Collections.reverseOrder());

		Integer b [] = {50,4,65,15,7,46};     // here we have to change the data type int to integer
		System.out.println("Array before sorting :" +Arrays.toString(b));
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println("Array After sorting :" +Arrays.toString(b));
		
		
	}

}
