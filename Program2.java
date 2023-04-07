/* Creating a menu to perform operations like
 1. Add
 2. Insert
 3. Remove
 4. Display
 5. Exit
 */
 
import java.util.*;
import java.lang.*;
import java.io.*;

public class Program2
{
  public static void main(String args[])  
  {
	Scanner s = new Scanner(System.in);
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	int choice;
	do{
	System.out.println("\n\n*******Choose an option from the Menu *******");
	System.out.println("1. Add");
	System.out.println("2. Insert");
	System.out.println("3. Remove");
	System.out.println("4. Display Element");
	System.out.println("5. Display List");
	System.out.println("6. Exit");
	System.out.println("\n\nEnter your choice:");
	choice=s.nextInt();
	
	switch(choice)
	{
		case 1: 
			System.out.println("Enter the Element in to the List : ");
			int e = s.nextInt();
			list.add(e);
			System.out.println(e+" is inserted successfully.");
			break;
			
		case 2: 
			System.out.println("Enter the index where you want to enter : ");
			int n = s.nextInt();
			System.out.println("Enter the Element you want to insert : ");
			int el = s.nextInt();
			list.add(n,el);
			System.out.println("The element "+el+" is successfully inserted at the index "+n);
			break;
				
		case 3: 
			System.out.println("Enter the position where you want to delete the element : ");
			int i = s.nextInt();
			list.remove(i);
			System.out.println("The element is succesfully deleted from the list");
			break;
				
		case 4: 
			System.out.println("Enter the position of the element you want to return : ");
			int r = s.nextInt();
			if(r > list.size())
			{
				System.out.println("Oops..! The list has less than "+r+" elements");
			}
			else
			{
				int ele = list.get(r-1);
				System.out.println("The element is : "+ele);
			}
			break;
				
		case 5: 
			//int len = list.size();
			if(list.size()==0)
			{
				System.out.println("The list is empty..  Try adding the elements.");
			}
			else
			{
				System.out.println("The List is : ");
				for (int elem: list)
					System.out.println(elem);	
			}
			break;
				
		case 6: 
			System.out.println("Quitting...... Bye......!");
			System.exit(0);
		
		default : System.out.println("Invalid input..!");
	}	
	}while(choice<=6);
  }	
}