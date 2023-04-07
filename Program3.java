import java.util.*;
import java.io.*;
import java.lang.*;

public class Program3
{
	public static void main(String args[])
	{
		Integer a[] = {1,2,3,1,2,3,3,3,3};
		Set<Integer> set = new HashSet<>(Arrays.asList(a));
		System.out.println(set);
	}
}