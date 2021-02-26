/*
 * created by 2019年7月22日 下午3:24:47
 */
package com.demo2.order.entity;

import com.demo2.support.entity.Entity;

/**
 * @author fangang
 */
public class Address extends Entity<Long> {
	private static final long serialVersionUID = -7715747957884378980L;
	private Long id;
	private Long customer_id;
	private Long country_id;
	private Long province_id;
	private Long city_id;
	private Long zone_id;
	private String address;
	private String phone_number;
	private Country country;
	private Province province;
	private City city;
	private Zone zone;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = (Long)id;
	}
	/**
	 * @return the customerId
	 */
	public Long getCustomerId() {
		return customer_id;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Long customerId) {
		this.customer_id = customerId;
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
	 * @return the cityId
	 */
	public Long getCityId() {
		return city_id;
	}
	/**
	 * @param cityId the cityId to set
	 */
	public void setCityId(Long cityId) {
		this.city_id = cityId;
	}
	/**
	 * @return the zoneId
	 */
	public Long getZoneId() {
		return zone_id;
	}
	/**
	 * @param zoneId the zoneId to set
	 */
	public void setZoneId(Long zoneId) {
		this.zone_id = zoneId;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phone_number;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phone_number = phoneNumber;
	}
	/**
	 * @return the country
	 */
	public Country getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(Country country) {
		this.country = country;
	}
	/**
	 * @return the province
	 */
	public Province getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(Province province) {
		this.province = province;
	}
	/**
	 * @return the city
	 */
	public City getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(City city) {
		this.city = city;
	}
	/**
	 * @return the zone
	 */
	public Zone getZone() {
		return zone;
	}
	/**
	 * @param zone the zone to set
	 */
	public void setZone(Zone zone) {
		this.zone = zone;
	}
}
