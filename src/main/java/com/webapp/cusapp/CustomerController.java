package com.webapp.cusapp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.webapp.cusapp.model.CustCacheDemo;
import com.webapp.cusapp.model.CustCustomQuery;
import com.webapp.cusapp.model.CustPageData;
import com.webapp.cusapp.model.CustSortDemo;
import com.webapp.cusapp.model.CustomerDetails;
import com.webapp.cusapp.model.DepartmentDetails;
import com.webapp.cusapp.repository.CustCacheDemoRepo;
import com.webapp.cusapp.repository.CustCustomQueryRepo;
import com.webapp.cusapp.repository.CustPageDataRepo;
import com.webapp.cusapp.repository.CustSortDemoRepo;
import com.webapp.cusapp.repository.CustomerDetailsRepo;
import com.webapp.cusapp.repository.DeptDetailsRepo;


@RestController
public class CustomerController {

	@Autowired
	CustomerDetailsRepo repo;
	
	@Autowired
	DeptDetailsRepo deptrepo;
	
	@Autowired
	CustPageDataRepo pagerepo;
	
	@Autowired
	CustCustomQueryRepo customrepo;
	
	@Autowired
	CustSortDemoRepo sortrepo;
	
	@Autowired
	CustCacheDemoRepo cacherepo;
	
	@GetMapping("/demo")
	public String demo() {
		System.out.println("code modified");
		return "demo app working..";
	}
	 @GetMapping(value = "/getCustDetails")
	 public CustomerDetails getCustDetails(@RequestParam int cust_id) {
		 Optional<CustomerDetails> custdet = repo.findById(cust_id);
		 return custdet.get();
	 }
	 
	 @PostMapping(value = "/insertupdate")
	 public String insertUpdateCust(@RequestBody CustomerDetails custdetails) {
		 deptrepo.save(custdetails.getDeptdetails());
		 repo.save(custdetails);
		 return "Customer details added to db";
	 }
	 
	 @GetMapping(value = "/deletecust")
	 public String deleteCust(@RequestParam int cust_id) {
		 repo.deleteById(cust_id);
		 return "Customer deleted";
	 }
	 
	 @PostMapping(value = "/insertcustpage")
	 public String insertUpdateCust1(@RequestBody List<CustPageData> custdetails) {
		 
		 custdetails.forEach(k->{
			 pagerepo.save(k);
		 });
		 return "Customer details added to db";
	 }
	 
	 @GetMapping(value="/getpagedata")
	 public List<CustPageData> getcustpagedata(@RequestParam int page_num){
		 Pageable paging = PageRequest.of(page_num, 5, Sort.by("custid"));
		 Page<CustPageData> pagedResult = pagerepo.findAll(paging);
		 return pagedResult.toList();
		 
	 }
	
	 @GetMapping(value = "/getcustpage")
	 public List<CustPageData> getcustpage(@RequestParam int page_num,@RequestParam int page_size) {
		 Pageable paging = PageRequest.of(page_num, page_size, Sort.by("custid"));
		 Page<CustPageData> pagedResult = pagerepo.findAll(paging);
		 return pagedResult.toList();
	 }
	 
	 @GetMapping(value = "/getcustcustom")
	 public List<CustCustomQuery> getcustcustom(@RequestParam String custname) {
		 List<CustCustomQuery> custobj = customrepo.findByName1(custname);
		 return custobj;
	 }
	 
	 @GetMapping(value = "/getcustsort")
	 public List<CustSortDemo> getcustsort(@RequestParam int custid) {
		 List<CustSortDemo> custobj = sortrepo.finbyIdAndSort(Sort.by("custname"),custid);
		 return custobj;
	 }
	 
	 @GetMapping(value = "/getcustnosort")
	 public List<CustSortDemo> getcustnosort(@RequestParam int custid) {
		 List<CustSortDemo> custobj = sortrepo.finbyId(custid);
		 return custobj;
	 }
	 
	 @GetMapping(value = "/getcustcache")
	 public List<CustCacheDemo> getcustcache(@RequestParam int custid) {
		 List<CustCacheDemo> custobj = cacherepo.findbyId(custid);
		 return custobj;
	 }
}
