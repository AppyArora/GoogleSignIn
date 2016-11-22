import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ApplicationContextAwareMainClass {
	public static void main(String[] args) {
		
		/*ApplicationContext factory = new ClassPathXmlApplicationContext("AutoWring.xml");
		CollectionInjection object= (CollectionInjection) factory.getBean("firstbean");
		object.show();
		
		
		*/
		
		
		
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("ApplicationContextAware.xml");
		PojoForApplicationContextAware object= (PojoForApplicationContextAware) factory.getBean("firstbean");
		PojoForApplicationContextAware object1= (PojoForApplicationContextAware) factory.getBean("secondbean");
		object.method();


		
		
	}
}
