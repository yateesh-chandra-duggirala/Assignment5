// Converting the List to Array 

import java.lang.*;
import java.io.*;
import java.util.*;

public class ListToArray
{
	public static void main(String args[])
	{
		List<String> rollnumber = new ArrayList<>();
		rollnumber.add("8");
		rollnumber.add("10");
		rollnumber.add("12");
		
		String[] array = rollnumber.toArray(new String[rollnumber.size()]);
		System.out.println("The array is : "+Arrays.toString(array));
		System.out.println("The List is : "+rollnumber);
	}
}