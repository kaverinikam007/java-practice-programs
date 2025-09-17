package Session9;

public class MutableVsImmutable
{

	public static void main(String[] args) 
	{
      //Mutable-----We Can Change
		
		
		/*
		int a[]= {20,10,40,50,30};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		*/
		
		
		//Immutable---Can Not Change
		String s=new String("Welcome");
		System.out.println(s);
		String concatString=s.concat("To Java");
		System.out.println(s);
		System.out.println(concatString);
		
		

	}

}
