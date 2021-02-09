/*
 * Created by 2021-02-09 14:59:11 
 */
package com.demo2.order.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.demo2.order.entity.Address;
import com.demo2.order.entity.Customer;
import com.demo2.order.service.CustomerService;

/**
 * @author fangang
 */
@Component
public class CustomerHystrixImpl implements CustomerService {
	private static Customer DEFAULT_CUSTOMER 
		= new Customer(null, "未知用户", "", null, "", "");
	private static Address DEFAULT_ADDRESS 
		= new Address(null, null, "未知国家", "未知省份", "未知地市", "未知乡镇", "未知地址", "");

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer load(long id) {
		return DEFAULT_CUSTOMER;
	}

	@Override
	public List<Customer> loadMore(List<Long> ids) {
		List<Customer> rtn = new ArrayList<>();
		rtn.add(DEFAULT_CUSTOMER);
		return rtn;
	}

	@Override
	public Address loadAddress(long id) {
		return DEFAULT_ADDRESS;
	}

	@Override
	public List<Address> loadAddresses(List<Long> ids) {
		List<Address> rtn = new ArrayList<>();
		rtn.add(DEFAULT_ADDRESS);
		return rtn;
	}

}
