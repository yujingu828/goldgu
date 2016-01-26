	package com.goldgu.esb.controller;

import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

/** * UserServiceTest.java 
 * Created on 2016年1月20日 下午2:42:29 
 */

/** 
 * <p>Project: goldgu-demo</p> 
 * <p>Title: UserServiceTest.java</p> 
 * <p>Description: 测试用户业务逻辑 </p> 
 * @author <a href="mailto:yujingu828@163.com">Jo Yu</a>
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TransmitControllerTest extends CamelTestSupport {

	@Test
	public void testInsertUser() throws Exception {
		String url = "http://192.168.2.132:8080/esb/insert";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.postForEntity(url, null, String.class).getBody();
		System.out.println(result);
	}

}
