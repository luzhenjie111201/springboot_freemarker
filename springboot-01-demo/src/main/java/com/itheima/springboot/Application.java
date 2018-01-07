/**
 * 
 */
package com.itheima.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.itheima.springboot.properties.ItcastProperties;

/** 
* @ClassName: Application 
* @Description: TODO(引导类) 
* @Author Mcgrady
* @Date 2018年1月6日 下午6:45:49 
*  
*/
@SpringBootApplication
@EnableConfigurationProperties(ItcastProperties.class)  //加载自定义配置类对象
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
