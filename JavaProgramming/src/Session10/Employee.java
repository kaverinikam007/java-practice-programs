package Session10;

public class Employee 
{
     //Variables
	int eid;
	String ename;
	String job;
	int sal;
	
	
	//Methods
	
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
		
	}
	
	public static void main(String[] args)
	{
		Employee employee1= new Employee();
		employee1.eid=101;
		employee1.ename="Kaveri";
		employee1.job="Manager";
		employee1.sal=50000;
		employee1.display();
		
		
		
		Employee employee2= new Employee();
		employee2.eid=102;
		employee2.ename="Umesh";
		employee2.job="CEO";
		employee2.sal=100000;
		employee2.display();
	}
	
}
