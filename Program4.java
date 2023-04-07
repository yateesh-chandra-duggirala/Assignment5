import java.util.*;
import java.io.*;
import java.lang.*;

public class Program4
{
	public static void main(String args[])
	{
		int a[] = {1,1,2,2};
		String s = "believe in yourself";
		ArrayList<Integer> intlist = new ArrayList();
				
		//Consider the Integer List
		for(int i=0; i<a.length; i++)
		{
			intlist.add(a[i]);
		}
		
		HashMap<Integer, Integer> hi = new HashMap();
		for(int i=0; i < intlist.size(); i++)
		{
			hi.putIfAbsent(intlist.get(i), Collections.frequency(intlist, intlist.get(i)));
		}
		System.out.println(hi);
		
		// Consider the String List
		HashMap<Character, Integer> hs = new HashMap();
		for(int i=0; i < s.length(); i++)
		{
			if(hs.containsKey(s.charAt(i)))
			{
				int count = hs.get(s.charAt(i));
				hs.put(s.charAt(i), ++count);
			}
			
			else
			{
				hs.put(s.charAt(i),1);
			}
		}
		System.out.println(hs);
	
	}
}
	