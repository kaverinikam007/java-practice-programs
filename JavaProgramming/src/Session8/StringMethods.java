package Session8;

import java.util.Arrays;

public class StringMethods
{

	public static void main(String[] args) 
	{
		
		//length()
		
		String s="Welcome";
		s.length();
		System.out.println(s.length());
		System.out.println("Welcome".length());
		
		//Concat()
		
		String s1="Welcome";
		String s2="To Java";
		String s3="Automation";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s1.concat(s2+s3));
		
		System.out.println("Welcome"+ "to java");
		System.out.println();
		
		//trim()
		
		s="   Welcome   " ;
		System.out.println(s);
		System.out.println("Before trimming:"+s.length());
		System.out.println(s.trim());
		System.out.println("After Trimmed:"+s.trim().length());
		
		//charAt()--Return a perticular character from a string based on index
		s="Welcome" ;
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(6));
		
		//Contains--Return always boolean value true/false
		
		System.out.println(s.contains("Wel"));
		System.out.println(s.contains("come"));
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("Come"));
		System.out.println(s.contains("welme"));
		
		//equals()-----Compare strings
		//equalsIgnoreCase-----Not consider case sensitivity
		s1="welcome";
		s2="welcome";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("Welcome"));
		System.out.println(s1.equalsIgnoreCase("Welcome"));
		
		//replace()---replace single/multiple (sequence) of character in a string
		s="welcome to java selenium hybrid driven framework";
		System.out.println(s.replace('e', 'x'));
		System.out.println(s.replace("selenium", "python"));
		
		//substring()--extract substring from main string
		//Starting index=0
		//Ending index=1
        s="selenium";
        System.out.println(s.substring(1,5));
        System.out.println(s.substring(0,3));
        
        
        //toUpperCase()        toLowerCase()
        s="welcome";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase()); 
        
        
        //split()--Split the string into multiple parts based on delimiter
		//delimiter -- @,.,spaces-------
         s="abc@gmail.com";
         String a[]=s.split("@");
         System.out.println(Arrays.toString(a));
         System.out.println(a[0]);
         System.out.println(a[1]);
         
            //Example1
         String amount="$15,20,25";
         System.out.print(amount.replace("$"," ").replace(","," "));
         
            //Example2
         s="abc,123@xyz";
         String arr1[]=s.split(",");
         System.out.println(Arrays.toString(arr1));
		
         
         
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
