/*
 * created by 2019年7月23日 下午4:18:12
 */
package com.demo2.order.service;

import java.util.List;

import com.demo2.order.entity.Order;

/**
 * @author fangang
 */
public interface OrderService {
	/**
	 * @param order the order entity
	 */
	public void createOrder(Order order);
	/**
	 * @param order the order entity
	 */
	public void modifyOrder(Order order);
	/**
	 * @param order the order entity
	 */
	public void deleteOrder(Order order);
	/**
	 * @param id the id of the order
	 * @return check the order exists or not
	 */
	public Order checkOrder(Long id);
	/**
	 * @return list all of orders
	 */
	public List<Order> listOfOrders();
}
