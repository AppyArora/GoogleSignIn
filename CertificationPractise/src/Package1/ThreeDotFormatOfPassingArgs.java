package Package1;

  class ThreeDotFormatOfPassingArgs {
	void put(String...args)
	{	
		for(String a: args)
		System.out.println("String is "+a);
	}
	void put2(int...args)
	{
		for(int i:args)
			System.out.println("int value is "+i);
	}


}
