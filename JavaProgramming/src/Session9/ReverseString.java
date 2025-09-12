package Session9;

public class ReverseString 
{
	public static void main(String[]args)
	{
		//Approach 1 ----length(), charAt()
		
		/*
		String s="selenium";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println("Reverse string is :" +rev);
		
		*/
		
		/*
		//Approach2--By converting string to char array type
		String s="welcome";
		String rev="";
		char a[]=s.toCharArray();
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
			
		}
		System.out.println("Reverse string is :" +rev);
		*/
		
		/*
		//Approach3--Using stringBuffer class
		 StringBuffer s= new StringBuffer("Welcome");
		 System.out.println("Reverse String is :"+s.reverse());
		 */
		
		
		//Approach4--Using stringBuilder class
		 StringBuilder s= new StringBuilder("Welcome");
		 System.out.println("Reverse String is :"+s.reverse());
	}

}
