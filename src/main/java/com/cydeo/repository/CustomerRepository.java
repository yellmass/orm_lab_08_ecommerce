package com.cydeo.repository;

import com.cydeo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    //Write a derived query to get customer by username
    List<Customer> getByUserName(String userName);
    //Write a JPQL query to get customer by email
    @Query("select c from Customer c where c.email=?1")
    List<Customer> retrieveByEmail(String email);
}
