package com.webapp.cusapp.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webapp.cusapp.model.CustSortDemo;

@Repository
public interface CustSortDemoRepo extends JpaRepository<CustSortDemo, Integer>{

	@Query("SELECT c FROM CustSortDemo c WHERE custid >= :id")
	List<CustSortDemo> finbyIdAndSort(Sort sort,int id);
	
	@Query("SELECT c FROM CustSortDemo c WHERE custid >= :id")
	List<CustSortDemo> finbyId(int id);
}
