// Converting the Array into List

import java.lang.*;
import java.io.*;
import java.util.*;

public class ArrayToList
{
	public static void main(String args[])
	{
		String[] array = {"Yateesh","Srinivasa","Shiva"};
		System.out.println("The Array is : "+Arrays.toString(array));
		
		List<String> list = new ArrayList<String>();
		for(String name : array)
		{
			list.add(name);
		}
		System.out.println("The list is : "+list);
	}
}