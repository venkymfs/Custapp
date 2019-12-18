package com.webapp.cusapp.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.webapp.cusapp.model.CustomerDetails;
import com.webapp.cusapp.model.DepartmentDetails;
 
@Repository 
public interface DeptDetailsRepo extends CrudRepository<DepartmentDetails, Integer>{
 
	
 }