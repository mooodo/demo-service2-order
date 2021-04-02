/*
 * Created by 2021-02-25 22:39:05 
 */
package com.demo2.order.entity;

import com.demo2.support.entity.Entity;

/**
 * @author fangang
 */
public class Zone extends Entity<Long> {
	private static final long serialVersionUID = 687618248150821225L;
	private Long id;
	private String name;
	private Long province_id;
	private Long city_id;

	@Override
	public Long getId() {
		return id;
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
	 * @return the provinceId
	 */
	public Long getProvinceId() {
		return province_id;
	}

	/**
	 * @param provinceId the provinceId to set
	 */
	public void setProvinceId(Long provinceId) {
		this.province_id = provinceId;
	}

	/**
	 * @return the city_id
	 */
	public Long getCity_id() {
		return city_id;
	}

	/**
	 * @param city_id the city_id to set
	 */
	public void setCity_id(Long city_id) {
		this.city_id = city_id;
	}

}
