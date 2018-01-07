/**
 * 
 */
package com.itheima.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.springboot.properties.ItcastProperties;

/** 
* @ClassName: HelloController 
* @Description: TODO(处理器) 
* @Author Mcgrady
* @Date 2018年1月6日 下午6:47:55 
*  
*/
@Controller
public class HelloController {

	//第一种方式读取配置项
	@Autowired
	private Environment environment;
	
	//第二种方式读取配置项
	@Value("${cn.itcast.name}")
	private String itcastName;
	@Value("${cn.itcast.url}")
	private String itcastUrl;
	@Value("${com.itheima.name}")
	private String itheimaName;
	
	//第三种方式读取配置项
	@Autowired
	private ItcastProperties itcastProperties;
	
	@RequestMapping("/test")
	@ResponseBody
	public String sayHello() {
		System.out.println("------第一种方式------");
		System.out.println(environment.getProperty("cn.itcast.name"));
		System.out.println(environment.getProperty("cn.itcast.url"));
		System.out.println(environment.getProperty("com.itheima.name"));
		
		System.out.println("------第二种方式------");
		System.out.println(itcastName);
		System.out.println(itcastUrl);
		System.out.println(itheimaName);
		
		System.out.println("------第三种方式------");//只能去读两项，符合cn.itcast前缀的只有两项
		System.out.println(itcastProperties.getName());
		System.out.println(itcastProperties.getUrl());
		
		return "HelloWorld!";
	}
}
