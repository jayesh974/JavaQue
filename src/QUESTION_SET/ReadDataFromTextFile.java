package QUESTION_SET;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {
	
	public static void main(String[] args) throws IOException {
		
//		Approach1 : Using FileReader & BufferReader
		
		FileReader fr = new FileReader("C:\\Users\\Admin\\eclipse-workspace2\\JavaQue\\src\\QUESTION_SET\\Test");
		
		BufferedReader br = new BufferedReader(fr);
		
		String str ;
		
		while((str = br.readLine())!= null)
		{
			System.out.println(str);
		}
		 br.close();
		
//		 Approach2 : Using File and Scanner
		 
		 File fl = new File("C:\\Users\\Admin\\eclipse-workspace2\\JavaQue\\src\\QUESTION_SET\\Test");
		 
		 Scanner sc = new Scanner(fl);
		 
		 while(sc.hasNextLine())
		 {
			 System.out.println(sc.nextLine());
		 }

	}
}
