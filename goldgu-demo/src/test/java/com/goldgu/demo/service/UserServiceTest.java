	package com.goldgu.demo.service;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;

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
public class UserServiceTest extends CamelTestSupport {

	@Autowired
	private ProducerTemplate producerTemplate;

	@Autowired
	private CamelContext camelContext;

	// @Test
	// public void testInsert() {
	// // Users user = new Users();
	// // user.setId(1);
	// // user.setName("test");
	// // user.setAge(20);
	//
	// // Exchange in =
	// //
	// this.camelContext.getEndpoint("direct:start").createExchange(ExchangePattern.InOut);
	// // in.getIn().setBody(user);
	// //
	// // Exchange out =
	// // this.producerTemplate.send("mybatis:insert?statementType=Insert",
	// // in);
	//
	// //
	// this.producerTemplate.setDefaultEndpointUri("http://localhost:8080/goldgu/insert");
	//
	// //
	// builder.from("direct:start").to("http://localhost:8080/goldgu/insert");
	//
	// }


	@Test
	public void testHello() throws Exception {
		camelContext.addRoutes(new RouteBuilder() {
			public void configure() throws Exception {
				from("direct:insert1").convertBodyTo(String.class, "UTF-8")
				.to("http://localhost:8080/goldgu/insert");
			}
		});
		
		//camelContext.stopRoute("insert");
		// camelContext.startRoute("insert");

		JSONObject jsonObj = new JSONObject();
		jsonObj.put("id", "1");
		jsonObj.put("name", "joyu");
		String reply = this.producerTemplate.requestBody("direct:insert1", jsonObj.toString(), String.class);
		System.out.println("out: " + reply);
	}

}
