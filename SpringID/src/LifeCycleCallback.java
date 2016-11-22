import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LifeCycleCallback {
	public static void main(String[] args) {
		
		/*ApplicationContext factory = new ClassPathXmlApplicationContext("AutoWring.xml");
		CollectionInjection object= (CollectionInjection) factory.getBean("firstbean");
		object.show();
		
		
		*/
		
		
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeCycleCallBack.xml");
		context.registerShutdownHook();
		LifeCycleCallBackPpojo object= (LifeCycleCallBackPpojo) context.getBean("firstbean");
	
		object.method();


		
		
	}
}
