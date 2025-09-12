package Session9;

public class CaseComparison {
	

	public static void main(String[] args) 
	{
		//Case 1
		
		String s1="welcome";
		String s2="welcome";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		
		//Case 2
		/*
		String s1=new String("welcome");
		String s2=new String("welcome");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		*/
		
		
		//Case3
		/*
		String s1="welcome";
		String s2=new String("welcome");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		*/
	}

}
