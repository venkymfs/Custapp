package com.webapp.cusapp.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.webapp.cusapp.model.CustomerDetails;
 
@Repository public interface CustomerDetailsRepo extends
CrudRepository<CustomerDetails, Integer>{
 
 }