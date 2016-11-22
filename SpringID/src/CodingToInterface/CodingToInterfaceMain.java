package CodingToInterface;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CodingToInterfaceMain{
	/**
	 *This is to inject the value to the object  
	 */

public static void main(String[] args) {
	

	ApplicationContext context = new ClassPathXmlApplicationContext("CodingToInterface/CodeToInterface.xml");
	DrawInterface drawInterface =(DrawInterface)context.getBean("Circle");
	
	drawInterface.draw();

}	

}
