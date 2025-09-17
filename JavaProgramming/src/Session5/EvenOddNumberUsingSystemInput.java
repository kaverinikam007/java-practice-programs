package Session5;

import java.util.Scanner;

public class EvenOddNumberUsingSystemInput 
{

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		  while (true) 
		  {  
	            System.out.print("Enter a number (or -1 to exit): ");
	            int i = sc.nextInt();

	            if (i == -1) 
	            { // exit condition
	                System.out.println("Program ended.");
	                break;
	            }
	     
	      //System.out.print("Enter a number: ");
	     
	     // int i = sc.nextInt();
	      
	      
	      
             if(i%2==0)
				{
					System.out.println(i + " Even ");
				}
				else
				{
					System.out.println(i + " Odd ");
				}
				
		  }
	}

}
