import java.lang.*;
import java.io.*;
import java.util.*;
public class Program5
{
	static Queue<Integer> reverseK(Queue<Integer> q, int k)
	{
		solve(q, k);
		int s = q.size() - k;
		while(s --> 0)
		{
			int x = q.poll();
			q.add(x);
		}
		return q;
	}
	static void solve(Queue<Integer> q, int k)
	{
		if(k == 0)
		return;
		
		int e = q.poll();
		solve(q, k-1);
		q.add(e);
	}
	public static void main(String args[])
	{
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		System.out.print("The current list is :" );
		for(int s : queue)
		{
		System.out.print(s + ",");
		}
		System.out.print("\b\n");

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of k : ");
		int k = s.nextInt();
		
		queue = reverseK(queue, k);
		while(!queue.isEmpty())
		{
			System.out.print(queue.poll() + ",");
		}
		
	}	
}

		