package com.webapp.cusapp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.webapp.cusapp.model.CustPageData;

@Repository
public interface CustPageDataRepo extends PagingAndSortingRepository<CustPageData, Integer>  {

}
