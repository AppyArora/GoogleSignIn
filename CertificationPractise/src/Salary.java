import java.util.EmptyStackException;


public class Salary extends Employee
{
	void X()
	{
		System.out.println("i m in salary");
	}
	void Y()
	{
		
		System.out.println("i m in salary y");
		
	}
	
	public static void main(String[] args) {
		
		Employee e = new Salary();
		Salary p =new Salary();
		e.x();
		p.Y();
		
		
	}
	
	
	
	
}
