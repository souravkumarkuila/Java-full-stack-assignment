package io.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean {
	private  int id;
    private String name;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
	public  void display(){
        System.out.println("id: "+getId()+"\n"+"Name: "+getName());
    }
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initization bean");
		
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroying the bean");
	}
	
	
}
