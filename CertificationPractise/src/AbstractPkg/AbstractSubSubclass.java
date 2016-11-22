package AbstractPkg;

public class AbstractSubSubclass  extends ClassAbstractSubClass{

	@Override
	void print2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void printclass() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void printclass(int... x) {
		for(int i:x)
		{
			System.out.println(i);
			
		}
	
	
	}
public static void main(String[] args) {
	
	AbstractSubSubclass obj = new AbstractSubSubclass();
	obj.printclass(1,2,4,5);
	
}
	
	
	
}
