import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClassForCollections {
	public static void main(String[] args) {
		
		/*ApplicationContext factory = new ClassPathXmlApplicationContext("AutoWring.xml");
		CollectionInjection object= (CollectionInjection) factory.getBean("firstbean");
		object.show();
		
		
		*/
		
		
		
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("AutoWring.xml");
		PojoSpring object= (PojoSpring) factory.getBean("firstbean");
		object.pojomethod();
		
		
		
	}
}
