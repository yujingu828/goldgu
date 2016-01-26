/** * InitListener.java 
* Created on 2016年1月26日 下午2:15:12 
*/

package com.goldgu.esb.base;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/** 
 * <p>Project: goldgu-esb</p> 
 * <p>Title: InitListener.java</p> 
 * <p>Description: 系统启动时加载资源 </p> 
 * @author <a href="mailto:yujingu828@163.com">Jo Yu</a>
 */
public class InitListener implements ServletContextListener {
	
	private ApplicationContext applicationContext;
	private CamelContext camelContext;

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		try {
			camelContext.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 启动时加载转发路由
	 */
	@Override
	public void contextInitialized(ServletContextEvent event) {
		applicationContext = WebApplicationContextUtils.getWebApplicationContext(event.getServletContext()); 
		camelContext = (CamelContext) applicationContext.getBean("camel");
		try {
			camelContext.addRoutes(new RouteBuilder() {
				public void configure() throws Exception {
					from("direct:insert").convertBodyTo(String.class, "UTF-8").to("http://localhost:8080/goldgu/insert");
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
