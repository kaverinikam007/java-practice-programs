package Session9;

public class StringVsStringBufferVsStringBuilder
{

	public static void main(String[] args) 
	{
		//Strimg--Immutable
		
		/*
	    String s="Welcome";
        s.concat("To Java");
        System.out.println(s);
        */
		
		/*
		//String Buffer --Mutable
		StringBuffer s= new StringBuffer("Welcome ");
		s.append("To Java");
		System.out.println(s);
        */
		
		//String Builder --Mutable
		StringBuilder s= new StringBuilder("Welcome ");
		s.append("To Java");
		System.out.println(s);
	    
	}

}
