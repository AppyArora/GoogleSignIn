package Package1;

public class Intertance extends ThreeDotFormatOfPassingArgs{
	protected int a=0;
	
	protected void method1()
	{
		System.out.println("i m in the method");
	}
	public static void main(String[] args) {
		Intertance obj = new Intertance();
		obj.put("1");
		
	}

}
