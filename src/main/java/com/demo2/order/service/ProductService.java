/* 
 * Created by 2018年9月10日
 */
package com.demo2.order.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo2.order.entity.Product;
import com.demo2.order.service.impl.ProductHystrixImpl;

/**
 * The service for products.
 * @author fangang
 */
@FeignClient(value="service-product", fallback=ProductHystrixImpl.class)
public interface ProductService {
	/**
	 * get a product by id.
	 * @param id
	 * @return a certain product.
	 */
	@GetMapping("orm/product/getProduct")
	public Product getProduct(@RequestParam("id")Long id);
	
	/**
	 * get a list of products by their id.
	 * @param ids
	 * @return a list of products
	 */
	@PostMapping("orm/product/getProductList")
	public List<Product> getProductList(@RequestParam("ids") String ids);
}
