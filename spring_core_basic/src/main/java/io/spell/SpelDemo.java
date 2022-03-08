package io.spell;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class SpelDemo {
 
    public static void main(String[] args) {
     
            ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring7.xml");
            Author author = (Author) context.getBean("authorBean");
            System.out.println(author.toString());
            System.out.println(author.getFullAuthorInfo());
            
    }
}