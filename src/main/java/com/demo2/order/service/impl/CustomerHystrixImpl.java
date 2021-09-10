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
	private final static Customer DEFAULT_CUSTOMER
		= new Customer(null, "未知用户", "", null, "", "");
	private final static Address DEFAULT_ADDRESS
		= new Address();

	@Override
	public Customer load(long id) {
		Customer customer = (Customer)DEFAULT_CUSTOMER.clone();
		customer.setId(id);
		return customer;
	}

	@Override
	public List<Customer> loadMore(String ids) {
		if(ids==null) return null;
		List<Customer> rtn = new ArrayList<>();
		String[] listOfId = ids.split(",");
		for(String id : listOfId) {
			rtn.add(load(new Long(id)));
		}
		return rtn;
	}

	@Override
	public Address loadAddress(long id) {
		Address address = (Address)DEFAULT_ADDRESS.clone();
		address.setId(id);
		return address;
	}

	@Override
	public List<Address> loadAddresses(String ids) {
		if(ids==null) return null;
		List<Address> rtn = new ArrayList<>();
		String[] listOfId = ids.split(",");
		for(String id : listOfId) {
			rtn.add(loadAddress(new Long(id)));
		}
		return rtn;
	}

}
