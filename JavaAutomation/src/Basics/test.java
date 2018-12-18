package Basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws IOException {
		
		String testFile = "D:\\test.txt";
		//File FC = new File(testFile);//Created object of java File class.
		//FC.createNewFile();
		
		
		FileReader FR = new FileReader(testFile);
		BufferedReader BR = new BufferedReader(FR);
		String Content = "";
		  
		//Loop to read all lines one by one from file and print It.
		while((Content = BR.readLine())!= null){
		System.out.println(Content);
		}
		FR.close();

	}
	
}
