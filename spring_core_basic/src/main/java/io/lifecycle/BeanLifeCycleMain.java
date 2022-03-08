package io.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring9.xml");
        context.registerShutdownHook();

        BeanLifeCycle beanLifeCycle=(BeanLifeCycle) context.getBean("LifeCycle");
        beanLifeCycle.display();
	}

}
