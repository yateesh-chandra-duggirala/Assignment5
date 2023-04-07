//Sample example for List

import java.util.*;
import java.lang.*;
import java.io.*;

public class List1
{
	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>();
		list.add("Yateesh Chandra");
		list.add("Srinivas");
		list.add("Shiva");
		
	
		
		for(String name : list)
			System.out.println(name);
	}
}