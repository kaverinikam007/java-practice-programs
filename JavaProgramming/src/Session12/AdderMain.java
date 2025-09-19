package Session12;

public class AdderMain 
{
	public static void main(String[]args)
	{
		Adder adder=new Adder();
		
		adder.sum();
		adder.sum(100,200);
		adder.sum(10.5,20);
		adder.sum(10,15.5);
		adder.sum(10,20,30);
	}

}
