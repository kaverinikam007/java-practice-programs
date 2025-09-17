package PracticeProgram;
import java.util.*;
public class MyFirstJavaProgram 
{
	
  public static void main(String []args)
  {
	  Scanner sc = new Scanner(System.in);
     
      System.out.print("Enter first number: ");
      int a = sc.nextInt();

      System.out.print("Enter second number: ");
      int b = sc.nextInt(); 
      
	 MyFirstJavaProgram obj= new MyFirstJavaProgram();
	 int result=obj.addition(a,b);
	 
	System.out.println("Addition of two number  " +result);
	 result=obj.substraction(a, b);
	System.out.println("Substraction of two number  " +result);
	result=obj.multiplication(a, b);
	System.out.println("Multiplication of two number  " +result);
	
  }
  
  public int addition(int a,int b)
  {
	  int c=a+b;
	  
	  return c;
  }
  
  public int substraction(int a,int b)
  {
	  int c=a-b;
	  
	  return c;
  }
  
  public int multiplication(int a,int b)
  {
	  int c=a*b;
	  
	  return c;
  }
  
}
