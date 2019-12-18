package com.webapp.cusapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.webapp.cusapp.model.CustDtlsEmbdemo;

@Repository
public interface CustDtlsEmbdemoRepo extends CrudRepository<CustDtlsEmbdemo, Integer> {

}
