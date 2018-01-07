/**
 * 
 */
package com.itheima.springboot.datasource;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/** 
* @ClassName: C3p0ConfigurationTest 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @Author Mcgrady
* @Date 2018年1月6日 下午9:53:26 
*  
*/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class C3p0ConfigurationTest {

	@Autowired
	private DataSource dataSource;
	@Test
	public void test() throws Exception {
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
	}

}
