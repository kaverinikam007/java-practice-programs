package Session14;

class C
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class D extends C
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}
class E extends D
{
	int c;
	void print()
	{
		System.out.println(c);
	}
}
public class MultilevelInheritance 
{

	public static void main(String[] args)
	{
		E cobj=new E();
		cobj.a=100;
		cobj.b=200;
		cobj.c=300;
		cobj.display();
		cobj.show();
		cobj.print();
	}

}
