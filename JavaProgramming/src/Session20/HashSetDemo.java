package Session20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo 
{

	public static void main(String[] args) 
	{
		//Declaration
		HashSet myset=new HashSet();
		
		//Adding elements into hast set
		myset.add(100);
		myset.add(10.5);
		myset.add("Welcom");
		myset.add(true);
		myset.add('A');
		myset.add(null);
		myset.add(null);
		
		//Printing HashSet
		System.out.println(myset);
		
		//Size of HashSet
		System.out.println("Size of HashSet:"+myset.size());
		
		//Removing Elements
		myset.remove(10.5);
		System.out.println("After Removing:"+myset);
		
		//Inserting element-Not Possible
		//Access Specific element-Not Possible
		
		//Convert HashSet---->Arraylist
		ArrayList arraylist=new ArrayList(myset);
		System.out.println(arraylist);
		System.out.println(arraylist.get(2));
		
		//Reading all the elements using for---each loop
		/*for(Object x:myset)
		{
			System.out.println(x);
		}
		*/
		
		//Using Iterator
		Iterator <Object> iterator=myset.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		//Clearing all the elements in the HashSet
		myset.clear();
		System.out.println(myset.isEmpty());
		
		

	}

}
