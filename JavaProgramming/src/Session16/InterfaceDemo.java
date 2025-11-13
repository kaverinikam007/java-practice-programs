package Session16;

interface shape
{
	int length=10;
	int width=20;
	void circle();
	
	default void squre()
	{
		System.out.println("This is default squre method");
		
	}
	static void rectangle()
	{
		System.out.println("This is rectangle static method");
	}
}

public class InterfaceDemo implements shape
{
   public void circle()
   {
	   System.out.println("This is circle abstract method");
   }
   
   public void Triangle()
   {
	   System.out.println("This is triangle abstract method");
   }
	public static void main(String[] args) 
	{
		//Scenario 1
		/*InterfaceDemo interfacedemo=new InterfaceDemo();
		interfacedemo.circle();
		interfacedemo.squre();
		shape.rectangle();
		interfacedemo.Triangle();
		*/
		//Scenario 2
		
		shape sh=new InterfaceDemo();
		
		sh.circle();
		sh.squre();
		
		shape.rectangle();
		
		System.out.println(shape.length*shape.width);

	}

}
