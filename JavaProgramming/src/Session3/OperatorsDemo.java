package Session3;

public class OperatorsDemo {

	public static void main(String[] args) {
		//Arithmetic Operators + - * / % 
		
		int a=20, b=10;
		int result=a+b;
		System.out.println("Sum of a and b is :"+result);
		System.out.println("Sum of a and b is :"+(a+b));
		System.out.println("Diff of a and b is :"+(a-b));
		System.out.println("mul of a and b is :"+(a*b));
		System.out.println("Div of a and b is :"+(a/b));
		System.out.println("Modulo of a and b is :"+(a%b));
		
		
		//Relational/Comparison Operators   > >=   < <=   !=   ==
		//Return always boolean value(true/false)
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		b=20;
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		boolean res=a>b;
		System.out.println(res);
		
		
		//Logical Operators   &&   ||    !
		//Works between two boolean values
		
		boolean x= true;
		boolean y= false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1= 10 > 20;
		System.out.println(b1);
		
		boolean b2= 20>10;
		System.out.println(b2);
		
		System.out.println(b1 && b2);
		System.out.println(b1 || b2);
		System.out.println((10<20)&&(20>10));
		
		
		
	}

}
