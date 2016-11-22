
public class PojoSpring {
	/**
	 *This is to inject the value to the object  
	 */
	PointClass pointClassA;
	PointClass pointClassB;
	PointClass pointClassC;
	public PointClass getPointClassA() {
		return pointClassA;
	}
	
	
	PojoSpring()
	{
		
	}
	public void setPointClassA(PointClass pointClassA) {
		this.pointClassA = pointClassA;
		
		
		
		
		
	}
	PojoSpring(PointClass a , PointClass b ,PointClass c)
	{
		pointClassA=a;
		pointClassB=c;
		pointClassC=c;
		
	}
	
	
	
/*	public PointClass getPointClassB() {
		return pointClassB;
	}
	public void setPointClassB(PointClass pointClassB) {
		this.pointClassB = pointClassB;
	}
	public PointClass getPointClassC() {
		return pointClassC;
	}
	public void setPointClassC(PointClass pointClassC) {
		this.pointClassC = pointClassC;
	}

*/

	/**
	 * this was the code for simple varible intialization 

	 *
	 *-------------------------------------------------------------
	 */

	/*private String name;
	private String lastname;
	private float a;
	public PojoSpring(float a)
	{
		this.a=a;
	System.out.println("value of a is"+a);	
	}

	public PojoSpring(String lastname) {
		System.out.println("lastname is"+lastname);
	}
	public PojoSpring(String name, int a)
	{
		this.name=name;
		this.a = a;
		System.out.println("cons with 2 parameter");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 */



	/**
	 * 
	 * ------------------------------------------------------------------------------------------------
	 * 
	 */
	public void pojomethod()
	{
		//	System.out.println("name is :"+name+"last name is"+a);
		System.out.println("value of pointClassA x is"+pointClassA.getX());
		System.out.println("value of pointClassA y is"+pointClassA.getY());
		System.out.println("value of pointClassB xis::"+pointClassB.getX());
		System.out.println("value of the pointClassC xis:::"+pointClassC.getX());
	}

}
