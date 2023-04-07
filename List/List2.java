// Get and Set Element in List

import java.util.*;
import java.io.*;
import java.lang.*;

public class List2
{
	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>();
		list.add("Yateesh Chandra");
		list.add("Siva");
		list.add("Vishnu");
		
		System.out.println("Returning last Element : "+list.get(2));
		list.set(1,"Shakthi");
		
		for(String name:list)
			System.out.println(name);
	}
}
		