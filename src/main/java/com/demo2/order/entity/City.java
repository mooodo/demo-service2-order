/*
 * Created by 2021-02-25 22:36:30 
 */
package com.demo2.order.entity;

import com.demo2.support.entity.Entity;

/**
 * @author fangang
 */
public class City extends Entity<Long> {
	private static final long serialVersionUID = -2576882584105673594L;
	private Long id;
	private String name;
	private Long province_id;

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

}
