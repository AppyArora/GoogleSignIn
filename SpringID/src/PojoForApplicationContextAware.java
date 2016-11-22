import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class PojoForApplicationContextAware implements ApplicationContextAware,BeanNameAware{
	/**
	 *This is to inject the value to the object  
	 */
	PointClass pointClassA;
	PointClass pointClassB;
	PointClass pointClassC;
	int rollnum;
	
	
	
	public int getRollnum() {
		return rollnum;
	}
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	
	private ApplicationContext context;
	
	public PointClass getPointClassA() {
		return pointClassA;
	}
	public void setPointClassA(PointClass pointClassA) {
		this.pointClassA = pointClassA;
	}
	public PointClass getPointClassB() {
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
	
	void method()
	{
		System.out.println("value of A.x:"+pointClassA.x);
		System.out.println("value of B.x"+pointClassB.x);
		System.out.println("value of C.x"+pointClassC.x);
		System.out.println("value of rollnum is"+rollnum);
	}
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		System.out.println("i m in set applicationContext method");
		/*this.context=(ApplicationContext) context.getBean("firs");*/
		System.out.println( context.getBean("secondbean"));
	}
	@Override
	public void setBeanName(String Name) {
		System.out.println("name of bean is "+Name);
		
	}

	
	
	
}
