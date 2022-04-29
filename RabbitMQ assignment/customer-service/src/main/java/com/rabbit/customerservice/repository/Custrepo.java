package com.rabbit.customerservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rabbit.customerservice.model.Customer;

@Repository
public interface Custrepo extends CrudRepository<Customer, String> {

}
