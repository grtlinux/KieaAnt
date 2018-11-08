package sample3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class HelloApp {

	/*
	 * URL: https://docs.spring.io/spring/docs/3.2.x/spring-framework-reference/html/resources.html
	 */
	public static void main(String[] args) throws Exception {
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
		MessageBean bean = factory.getBean("messageBean", MessageBean.class);
		bean.sayHello("Spring3");
	}
}
