package io.context;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ContextAware implements ApplicationContextAware, BeanNameAware {

	private String place;
    Demo demo;
    
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Demo getDemo() {
		return demo;
	}
	public void setDemo(Demo demo) {
		this.demo = demo;
	}
    
	public void display(){
        System.out.println("Coordinate of "+getPlace()+
        		"("+getDemo().getX()+","+getDemo().getY()+")");

    }
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("application name "+applicationContext);
	}
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("Bean Name is:"+name);
	}
}
