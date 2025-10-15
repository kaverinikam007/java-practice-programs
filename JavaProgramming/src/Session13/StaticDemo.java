package Session13;

public class StaticDemo 
{
    static int a=10;
    int b=20;
     
    static void m1()
    {
    	System.out.println("This is m1 static method..........");
    }
    
    void m2()
    {
    	System.out.println("This is m2 non static method..........");
    }
    
    void m()
    {
    	System.out.println(a);
    	System.out.println(b);
    	m1();
    	m2();
    }
    
    
	public static void main(String[] args) 
	{
      // 1] Static method can access Static stuff directly(without creating object)
		
		//System.out.println(a);
		//m1();
		//System.out.println(b);
		//m2();
		
	  // 2] Static method can access non static stuff through object
		
		StaticDemo staticdemo=new StaticDemo();
		//System.out.println(staticdemo.b);
		//staticdemo.m2();
		staticdemo.m();
		
		
		
		
    }

}
