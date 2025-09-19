package Session11;

public class StudentMain 
{

	public static void main(String[] args) 
	{
		//Student student=new Student();
		
		//1.Using object reference variable
		/*
		student.sid=1;
		student.sname="Prajakta";
		student.grade='A';
		*/
		
		//Using Method
		
		//student.setStudentData(101,"Prajakta",'A');
		//student.printStudentData();
		
		//Using Constructor
		
		Student student=new Student(101,"John",'A');
		student.printStudentData();

	}

}
