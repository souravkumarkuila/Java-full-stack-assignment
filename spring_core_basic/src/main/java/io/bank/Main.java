package io.bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");

        BankAccountController controller = (BankAccountController)context.getBean("controller");


        System.out.println(controller.getBalance(285)); 
        System.out.println(controller.deposit(285,10000)); 
        System.out.println("+");
        System.out.println(controller.withdraw(285,50000)); 
        System.out.println(controller.getBalance(285));  // new balance
        System.out.println("+");
        System.out.println(controller.fundTransfer(285,347,10000)); 
        System.out.println(controller.getBalance(285));  
        System.out.println(controller.getBalance(347));  
	}

}
