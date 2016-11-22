package ProtectedCheck2;

import java.util.jar.Attributes.Name;

import ProtectedCheck.ClassA;


public class ClassB extends ClassA{
	
	//int b=a;
	void nn()
	{
		name();
	}
	public static void main(String[] args) {
		ClassA obj = new ClassA();
		
	
		ClassB obj1= new ClassB();
		//System.out.println(obj1.a);
		obj1.nn();
	}

}
