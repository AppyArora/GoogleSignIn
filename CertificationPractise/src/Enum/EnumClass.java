package Enum;


enum myclass
{
	Big(1),Small(10){
		int a=110;
		public int getsize()
		{
			return a;	
		}
	};

	private int size;

	myclass(int size)
	{
		this.size=size;
	}
	public int getsize()
	{
		return size;	
	}

}
public class EnumClass {

	myclass size;
	public static void main(String[] args) {
		EnumClass obj = new EnumClass();
		//System.out.println(obj.size.Big.getsize());
		for(myclass cs :myclass.values())
		{myclass[] cs1 =myclass.values();
			//System.out.println(cs+""+cs.getsize()+"*****************");
			System.out.println(cs1[1]);

		}

		System.out.println(java.util.Arrays.asList(myclass.values()));
		//System.out.println(myclass.Small.//
		System.out.println(myclass.Small.getsize());

	}


}
