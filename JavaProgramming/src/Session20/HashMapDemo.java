package Session20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo 
{
  public static void main(String[] args)
  {
	  //Declaration
	  //HashMap hashmap=new HashMap();
	  //Map map=new HashMap();
	  
	  HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
	  
	  //Adding pairs
	  hashmap.put(101,"John");
	  hashmap.put(102,"Scott");
	  hashmap.put(103,"Marry");
	  hashmap.put(104,"Scott");
	  hashmap.put(102,"David");
	  
	  System.out.println(hashmap);
	  System.out.println("Size of hashmap:"+hashmap.size());
	  
	  //Remove Pair
	  hashmap.remove(103);
	  System.out.println("After removing pair:"+hashmap);
	  
	  //Access value of the key
	  System.out.println(hashmap.get(102));
	  
	  //Get all the keys from Hashmap
	  System.out.println(hashmap.keySet());
	  System.out.println(hashmap.values());
	  System.out.println(hashmap.entrySet());
	  
	  //Reading data from Hashmap
	  // Using for....each loop
	  /*for(int key:hashmap.keySet())
	  {
		 System.out.println(key+"    "+hashmap.get(key)); 
	  }
	  */
	  
	  //Using Iterator
	  Iterator<Entry<Integer,String>> iterator=hashmap.entrySet().iterator();
	  while(iterator.hasNext()) 
	  {
		  Entry<Integer,String> entry=iterator.next();
		  System.out.println(entry.getKey()+"     "+entry.getValue());
	  }
	  
	  hashmap.clear();
	  System.out.println(hashmap.isEmpty());
	  
  }
}
