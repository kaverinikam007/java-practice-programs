package Session7;

import java.util.Arrays;

public class SortingElementInArray
{

	public static void main(String[] args) 
	{
		int a[]= {100,600,200,500,300,400};
		System.out.println("Before Sorting.....");
		System.out.println(Arrays.toString(a));  //100,600,200,500,300,400
		Arrays.sort(a);    
		System.out.println("After Sorting.....");// Sort element in array
		System.out.println(Arrays.toString(a));  // 100,200,300,400,500,600

	}

}
