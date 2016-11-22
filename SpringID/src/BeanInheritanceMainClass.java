import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanInheritanceMainClass {
	public static void main(String[] args) {
		
		/*ApplicationContext factory = new ClassPathXmlApplicationContext("AutoWring.xml");
		CollectionInjection object= (CollectionInjection) factory.getBean("firstbean");
		object.show();
		
		
		*/
		
		
		
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("BeanInheritance.xml");
		PojoBeanInheitance object= (PojoBeanInheitance) factory.getBean("ParentClass");
		
		object.method();


		
		
	}
}
