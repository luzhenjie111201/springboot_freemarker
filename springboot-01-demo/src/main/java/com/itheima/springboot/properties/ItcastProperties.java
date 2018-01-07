/**
 * 
 */
package com.itheima.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/** 
* @ClassName: ItcastProperties 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @Author Mcgrady
* @Date 2018年1月6日 下午7:14:54 
*  
*/
@ConfigurationProperties(prefix="cn.itcast",ignoreUnknownFields=true) //获取配置文件的配置项
public class ItcastProperties {
	private String name;
	private String url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
