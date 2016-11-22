import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanFactoryPostProcessorMain {
	public static void main(String[] args) {
		
	
		ApplicationContext factory = new ClassPathXmlApplicationContext("BeanFactoryPostProcessor.xml");
	
		BeanFacotryPostProcessorPojo obj = (BeanFacotryPostProcessorPojo)factory.getBean("firstbean");
		obj.method();


		
		
	}
}
