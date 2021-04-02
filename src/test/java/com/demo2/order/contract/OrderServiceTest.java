/*
 * Created by 2021-02-13 14:37:48 
 */
package com.demo2.order.contract;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.alibaba.fastjson.JSONObject;
import com.demo2.order.entity.Customer;
import com.demo2.order.entity.Order;

/**
 * @author fangang
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
@AutoConfigureStubRunner(ids= {
		"com.demo:demo-service2-customer:+:stubs:9002"}, stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class OrderServiceTest {
	@Autowired
	private MockMvc mvc;
	@Test
	public void testSaveAndDelete() throws Exception {
		Long id = new Long(50010);
		String idStr = id.toString();
		mvc.perform(post("/orm/order/createOrder")
				.param("id", idStr)
				.param("customerId", "10001")
				.param("addressId", "1000100")
				.param("amount", "4000")
				.param("orderTime", "2021-01-01")
				.param("flag", "CREATE"))
		.andExpect(status().isOk());
		
		Order order = new Order();
		order.setId(id);
		order.setCustomerId((long)10001);
		order.setCustomer(new Customer((long)10001, "李秋水", "女", 
				null, "510110197910012312", "13388990123"));
		order.setAddressId((long)1000100);
		order.setAmount((double)4000);
		//order.setOrderTime(DateUtils.getDate("2021-01-01", "yyyy-MM-dd"));
		order.setFlag("CREATE");
		String json = JSONObject.toJSONString(order);
		mvc.perform(get("/orm/order/checkOrder")
				.param("id", idStr))
		.andExpect(status().isOk())
		.andExpect(content().json(json));
		
		mvc.perform(post("/orm/order/modifyOrder")
				.param("id", idStr)
				.param("customerId", "10001")
				.param("addressId", "1000100")
				.param("amount", "4000")
				.param("orderTime", "2021-01-01")
				.param("flag", "PAYOFF"))
		.andExpect(status().isOk());
		
		order.setFlag("PAYOFF");
		json = JSONObject.toJSONString(order);
		mvc.perform(get("/orm/order/checkOrder")
				.param("id", idStr))
		.andExpect(status().isOk())
		.andExpect(content().json(json));
		
		mvc.perform(get("/orm/order/deleteOrder")
				.param("id", idStr))
		.andExpect(status().isOk());
		
		mvc.perform(get("/orm/order/checkOrder")
				.param("id", idStr))
		.andExpect(status().isOk())
		.andExpect(content().string(""));
	}
}
