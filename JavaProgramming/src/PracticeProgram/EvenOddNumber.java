package PracticeProgram;

import java.util.Scanner;

public class EvenOddNumber 
{
	public void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
	     
	      System.out.print("Enter a number: ");
	     
	      int i = sc.nextInt();
	      
               if(i%2==0)
				{
					System.out.println(i + "Even");
				}
				else
				{
					System.out.println(i + "Odd");
				}
				
			
			
	}
		
}
