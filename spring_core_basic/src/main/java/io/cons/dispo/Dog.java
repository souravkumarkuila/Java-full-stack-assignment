package io.cons.dispo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog implements InitializingBean, DisposableBean   {
	private  String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	 public void eat(){
	        System.out.println(getName()+" is eating.");
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("InitializingBean is called for dog bean");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("DisposableBean method is called");
	}
	
	// Called using init-method and destroy-method
    public void myInit(){
        System.out.println("Dog bean created for "+getName()+ " using init-method");
    }

    public  void  myDest(){
        System.out.println("Object is destroyed for "+getName()+ " using destroy-method");
    }
	
    // uses of annontation which performs the same operations as above two methods i.e
    // implementing methods or configuring XML file.
    
    @PostConstruct
    //This annotation marks a method that must be executed
    //after dependency injection is performed on the class.
    //InitializingBean interface calls PostContruct first
    public void postConstruct()
    {
        System.out.println("Construct called using PostConstruct");
    }

    @PreDestroy
    public  void  preDestroy(){
        System.out.println("destroy called using preDestroy annotation");
    }
	 
	 
}
