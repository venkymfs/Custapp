package com.webapp.cusapp.repository;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webapp.cusapp.model.CustCacheDemo;

@Repository
public interface CustCacheDemoRepo extends CrudRepository<CustCacheDemo, Integer> {

	@Cacheable(value="custdtls")
	@Query("SELECT p FROM CustCacheDemo p WHERE custid = :id")
	public List<CustCacheDemo> findbyId(int id);
}
