/*
 * Created by 2021-02-09 15:22:21 
 */
package com.demo2.order.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.demo2.order.entity.Product;
import com.demo2.order.service.ProductService;

/**
 * @author fangang
 */
@Component
public class ProductHystrixImpl implements ProductService {
	private final static String DEFAULT_IMAGE = "/static/img/default.jpg";
	private final static Product DEFAULT_PRODUCT
		= new Product(null, "未知产品", null, null, null, null, DEFAULT_IMAGE, null, null);

	@Override
	public Product getProduct(Long id) {
		return DEFAULT_PRODUCT;
	}

	@Override
	public List<Product> getProductList(String ids) {
		List<Product> rtn = new ArrayList<>();
		rtn.add(DEFAULT_PRODUCT);
		return rtn;
	}

}
