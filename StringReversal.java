package com.testProgrammingQuestions;
import java.util.*;

public class StringReversal {

	public static void main(String[] args) 
	{
		
		ArrayList<String> arraylist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of string to be added: ");
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter "+(i+1)+" String");
			String string = sc.next();
			arraylist.add(string);
		}
		
		int size = arraylist.size();
		
		System.out.println();
		System.out.println("Entered words are: ");
		for(String s: arraylist)
			System.out.print(s+" ");
		
		System.out.println();
		System.out.println("Reversed order is: ");
		for(int j=size-1;j>=0;j--)
			System.out.print(arraylist.get(j)+" ");

	}

}
