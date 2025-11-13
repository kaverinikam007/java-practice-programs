package Session15;

class Test
{
	final int x=100;
}

public class FinalKyeword 
{

	public static void main(String[] args) 
	{
		Test test=new Test();
		//test.x=200;         //incorrect bcoz x is final variable
		
		System.out.println(test.x);
	}

}
