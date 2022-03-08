package io.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring6.xml");
        DbConfiguration dbConfiguration = (DbConfiguration)context.getBean("dbConfiguration");
        dbConfiguration.display();
	}

}
