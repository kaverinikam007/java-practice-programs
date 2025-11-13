package Session20;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo 
{

	public static void main(String[] args)
	{
		//Declaration
		ArrayList mylist=new ArrayList();
		//List mylist =new Arraylist();
		//Arraylist<String>mylist=new Arraylist<String>();
		
		//Adding data into arraylist  
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//Size of Arraylist
		System.out.println("Size of an Arraylist:"+mylist.size());
		
		//Printing Arraylist
		System.out.println("Printing Data of an Arraylist:"+mylist);
		
		//Remove element from an Arraylist
		mylist.remove(5);
		System.out.println(" Arraylist after removing an element:"+mylist);
		
		//Insert element in the Arraylist
		mylist.add(2,"Java");
		System.out.println(" Arraylist after inserting of an element:"+mylist);
		
		//Modify element in the Arraylist(Modify/Replace/Change)
		mylist.set(2, "Python");
		System.out.println(" Arraylist after Replacing of an element:"+mylist);
		
		//Access specific element from Arraylist
		System.out.println(mylist.get(3));
		
		//Reading all the elements from the Array list
		//Using normal for loop
		/*for(int i=0; i<mylist.size();i++)
		{
			System.out.println(mylist.get(i));
		}
		*/
		
		//Using for...each loop
		/*for(Object x:mylist)
		{
			System.out.println(x);
		}
		*/
		
		//Using Iterator
		Iterator <Object> iterator=mylist.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		//Checking Array list is empty or not
		System.out.println("Is Array list empty?"+mylist.isEmpty());
		
		//Remove all the elements from the Array list
		ArrayList mylist2=new ArrayList();
		mylist2.add(100);
		mylist2.add("Welcome");
		
		mylist.removeAll(mylist2);
		System.out.println("After removing multiple elements:"+mylist);
		
		//Remove all the elements/Clear
		mylist.clear();
		System.out.println("Is arraylist empty?"+mylist.isEmpty());
	}

}
