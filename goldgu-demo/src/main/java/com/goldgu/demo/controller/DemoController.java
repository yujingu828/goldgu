/** * DemoController.java 
* Created on 2016年2月4日 上午10:21:58 
*/

package com.goldgu.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/** 
 * <p>Project: goldgu-demo</p> 
 * <p>Title: DemoController.java</p> 
 * <p>Description: 前端demo学习研究</p> 
 * @author <a href="mailto:yujingu828@163.com">Jo Yu</a>
 */
@Controller
public class DemoController {
	
	@RequestMapping(value = "/helloworld") 
	public String index() {
		return "helloworld";
	}
}
