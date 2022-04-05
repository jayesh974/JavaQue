package QUESTION_SET;

import java.util.HashSet;

public class DuplicateElementInArray {
	
	public static void main(String[] args) {
		
		
/*
//		1. Approach
		String a[] = {"java","c","c++","python","java","c"};
		boolean flag = false;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length ;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Found Duplicate Element "+a[i]);
					flag = true;
				}
			}
		}
		if(flag= false)
		{
			System.out.println("Duplicate Element is Not Found");
		}
*/
//	2. Approach --Using HashSet  -- does not allows duplicate value
		
		String a[] = {"java","c","c++","python","java","c"};
		
		HashSet<String> langs = new HashSet<String>();
		
		boolean flag = false;
		
		for(String l : a)
		{
			if(langs.add(l)==false)
			{
				System.out.println("Found Duplicate Element "+l);
			}
		}
		
		if(flag == true)
		{
			System.out.println("Not found any Duplicate");
		}
		
		
		
		
	}

}
