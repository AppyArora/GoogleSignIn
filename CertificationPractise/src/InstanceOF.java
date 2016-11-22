
public class InstanceOF {

	
	public static void main(String[] args) {
	
		Salary obj = new Salary();
		
		if(obj instanceof Object)
		{
			System.out.println("i m here");
			
		}
		if(obj instanceof Salary)
		{
			System.out.println("ye salary ka object h ");
		}
		
		
	}
	
}
