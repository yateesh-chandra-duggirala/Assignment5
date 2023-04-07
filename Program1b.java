// Creating a program to print the unique list of elements

import java.lang.*;
import java.io.*;
import java.util.*;

public class Program1b
{
	public static void main(String args[])
	{
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("C");
		arr.add("Java");
		arr.add("C++");
		arr.add("Java");
		arr.add("C");
		arr.add("Python");
		arr.add("C++");
		
		// Let us display the original List
		
		System.out.println("Original List : "+arr);
		
		
		ArrayList<String> arr1 = new ArrayList<String>();
		
		for(String ele:arr)
		{
			if(arr1.contains(ele))
			{
				continue;
			}
			
			else
			{
				arr1.add(ele);
			}
		}
		
		System.out.println("Unique Array List : "+arr1);
	}
}