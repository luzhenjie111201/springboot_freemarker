/**
 * 
 */
package com.itheima.springboot.datasource;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/** 
* @ClassName: DataSourceConfiguration 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @Author Mcgrady
* @Date 2018年1月6日 下午9:33:59 
*  
*/
@Configuration
public class DataSourceConfiguration {
	@Bean
	@Primary
	@ConfigurationProperties(prefix="c3p0")
	public DataSource getDataSource() {
		return DataSourceBuilder.create().type(ComboPooledDataSource.class).build();
	}
}
