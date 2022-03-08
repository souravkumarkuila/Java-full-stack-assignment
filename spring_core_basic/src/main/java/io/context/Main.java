package io.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring10.xml");
        ContextAware contextAwareExample = (ContextAware) context.getBean("contextAware");
        contextAwareExample.display();

        ContextAware contextAwareExample1 = (ContextAware) context.getBean("contextAware1");
        contextAwareExample1.display();
	}

}
