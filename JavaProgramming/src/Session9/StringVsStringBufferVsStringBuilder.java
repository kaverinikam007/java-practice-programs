package Session9;

public class StringVsStringBufferVsStringBuilder
{

	public static void main(String[] args) 
	{
		//Strimg--Immutable
		
		
	    String s="Welcome";
        s.concat("To Java");
        System.out.println(s);
        
	
		//String Buffer --Mutable
		StringBuffer s1= new StringBuffer("Welcome ");
		s1.append("To Java");
		System.out.println(s1);
        
		
		//String Builder --Mutable
		StringBuilder s2= new StringBuilder("Welcome ");
		s2.append("To Java");
		System.out.println(s2);
	    
	}

}
