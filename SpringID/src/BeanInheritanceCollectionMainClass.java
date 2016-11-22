import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanInheritanceCollectionMainClass {
	public static void main(String[] args) {
		
		/*ApplicationContext factory = new ClassPathXmlApplicationContext("AutoWring.xml");
		CollectionInjection object= (CollectionInjection) factory.getBean("firstbean");
		object.show();
		
		
		*/
		
		
		
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("BeanInheritanceCollection.xml");
		PojoBeanInheritanceCollection object= (PojoBeanInheritanceCollection) factory.getBean("child1");
		
		object.method();


		
		
	}
}
