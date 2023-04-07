// Creating a program to print the unique list of elements

import java.lang.*;
import java.io.*;
import java.util.*;

public class Program1a
{
	public static void main(String args[])
	{
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("C");
		arr.add("Java");
		arr.add("C++");
		arr.add("C");
		
		// Let us display the original List
		
		System.out.println("Original List : "+arr);
		
		// Hash Set contains the Unique Values
		
		HashSet<String> h = new HashSet<String>(arr);
		
		System.out.println("Unique Array List : "+h);
	}
}