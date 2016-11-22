import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;


public class SpringMainClass {

	public static void main(String[] args) {
		

		/**
		 * This is the execution throw XmlBean.
		 */
		/*	BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src/spring.xml"));
	PojoSpring object= (PojoSpring) factory.getBean("firstbean");
	object.pojomethod();
*/	
		
	/**
	 * This is the execution throw the Class path.
	 */
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		PojoSpring object= (PojoSpring) factory.getBean("firstbeanAlias2");
		object.pojomethod();
		
	}

}
