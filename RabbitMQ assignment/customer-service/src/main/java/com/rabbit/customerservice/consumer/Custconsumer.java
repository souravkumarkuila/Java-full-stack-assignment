package com.rabbit.customerservice.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rabbit.customerservice.config.MessagingConfig;
import com.rabbit.customerservice.model.Customer;
import com.rabbit.customerservice.transactions.Trans;

@Component
public class Custconsumer {
	
	@Autowired
    private Trans transactions;


    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(Customer c) {
        System.out.println("Message recieved from queue : " + c);
        Customer customer = transactions.saveCustomer(c);
    }
}
