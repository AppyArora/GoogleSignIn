import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;


public class BeanFacotryPostProcessorPojo implements BeanFactoryPostProcessor{

	PointClass pointClassA;
	PointClass pointClassB;
	
	
	


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

void method()
{
	
System.out.println(pointClassA.getX());

}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
			throws BeansException {
	System.out.println("i am in the factroy post processor"+beanFactory);
		
	}

}
