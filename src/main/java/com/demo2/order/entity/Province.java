/*
 * Created by 2021-02-25 22:33:07 
 */
package com.demo2.order.entity;

import com.demo2.support.entity.Entity;

/**
 * @author fangang
 */
public class Province extends Entity<Long> {
	private static final long serialVersionUID = -7966950398299804262L;
	private Long id;
	private String name;
	private Long country_id;

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

	/**
	 * @return the countryId
	 */
	public Long getCountryId() {
		return country_id;
	}

	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(Long countryId) {
		this.country_id = countryId;
	}

}
