package Session13;

public class ThisKeyword 
{
	int x,y;
	/*
     ThisKeyword(int x,int y)
     {
    	 this.x=x;
    	 this.y=y;
    	 
     }
     */
     void setData(int x,int y)
     {
    	 this.x=x;
    	 this.y=y;
    	 
     }
     void display()
     {
    	 System.out.println(x);
    	 System.out.println(y);
     }
     
     
     
	public static void main(String[] args) 
	{
		
		//ThisKeyword thiskeyword =new ThisKeyword(100,200);
		
		ThisKeyword thiskeyword =new ThisKeyword();
		thiskeyword.setData(100, 200);
		thiskeyword.display();
	}

}
