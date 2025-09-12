package Session7;

import java.util.Scanner;

public class TakingMultipleInputFromKyeboard
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter First Number:");
		int num1 =sc.nextInt();
		System.out.print("Enter Second Number:");
		int num2 =sc.nextInt();
		System.out.println("Addition of two numbers:" +(num1 + num2));
		
		/*
		System.out.println("Enter Name:");
		String name sc=next();
		System.out.println("Your name is :"+sc);
		System.out.println("Enter your age :");
		int age nm=nextInt();
		System.out.println("Your age is :" +nm);
		System.out.println("Enter Unknown value:");
		Object values=sc.next();
		System.out.println(values);
		
		*/
		
		

	}

}
