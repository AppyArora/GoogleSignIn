import java.awt.Point;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


public class DisplayNameBeanPostProcessor implements BeanPostProcessor {



	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("name of the bean After intialization::"+beanName+"  and the bean is :::"+bean);
		System.out.println();
		return bean;
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("name of the bean before intialization::"+beanName+"  and the bean is::: "+bean);
		System.out.println();
		return bean;
	}
	
	
	
	
	
}
