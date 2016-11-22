import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;


public class LifeCycleCallBackPpojo implements ApplicationContextAware,BeanNameAware{
	/**
	 *This is to inject the value to the object  
	 */
	PointClass pointClassA;
	PointClass pointClassB;
	PointClass pointClassC;




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

	}
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		System.out.println("i m in set applicationContext method");

	}
	@Override
	public void setBeanName(String Name) {
		System.out.println("name of bean is "+Name);

	}

	/*@Override
	public void destroy() throws Exception {
		System.out.println("when i need to destory the bean");

	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("before initailizing bean");
	}	*/

/*


	public void myInit(){
		System.out.println("when i need to destory the bean");


	}
	
	public void myInit1(){
		System.out.println("when i need to destory the bean1");


	}
	public void cleanup()
	{

		System.out.println("before initailizing bean");
	}

	public void cleanup1()
	{

		System.out.println("before initailizing bean1");
	}
*/
}
