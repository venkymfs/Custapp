package com.webapp.cusapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webapp.cusapp.model.CustCustomQuery;

@Repository
public interface CustCustomQueryRepo extends JpaRepository<CustCustomQuery, Integer>  {

	@Query("SELECT c FROM CustCustomQuery c WHERE custname = ?1")
	List<CustCustomQuery> findByName(String name);
	
	@Query("SELECT c FROM CustCustomQuery c WHERE custname = :name")
	List<CustCustomQuery> findByName1(String name);
	
	
}
