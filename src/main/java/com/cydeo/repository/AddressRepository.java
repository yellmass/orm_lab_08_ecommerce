package com.cydeo.repository;

import com.cydeo.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {

    //Write a derived query to get all addresses starting with a street name
    List<Address> getByStreetStartsWith(String street);
    //Write a derived query to get top 3 addresses with a specific customer email
    List<Address> getTop3ByCustomer_Email(String email);

    //Write a JPQL query to get all addresses with a specific customerId

    @Query("select a from Address a where a.customer.id=?1")
    List<Address> retrieveAddressByCustomerId(Long customerId);

}
