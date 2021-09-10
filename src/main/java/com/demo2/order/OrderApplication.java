/* 
 * create by 2020年1月24日 下午12:51:32
 */
package com.demo2.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * @author fangang
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.demo2"})
@ImportResource(locations={"classpath*:applicationContext-*.xml"})
@MapperScan("com.demo2.support.dao")
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
public class OrderApplication {

	/**
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
		System.out.println(".....................................");
		System.out.println("....The Order Application started....");
		System.out.println(".....................................");
	}

}
