/*
 * Created by 2021-02-25 22:30:27 
 */
package com.demo2.order.entity;

import com.demo2.support.entity.Entity;

/**
 * @author fangang
 */
public class Country extends Entity<Long> {
	private static final long serialVersionUID = 6234919102569211485L;
	private Long id;
	private String name;
	
	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
