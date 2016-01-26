/** * UserController.java 
* Created on 2016年1月20日 下午4:24:12 
*/

package com.goldgu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.goldgu.demo.service.impl.UsersService;

/** 
 * <p>Project: goldgu-demo</p> 
 * <p>Title: UserController.java</p> 
 * <p>Description: 用户管理</p> 
 * @author <a href="mailto:yujingu828@163.com">Jo Yu</a>
 */
@Controller
public class UserController {

	@Autowired
	private UsersService usersService;

	@RequestMapping(value = "/insert")
	@ResponseBody
	public String insert() {
		usersService.insertUser();
		return "ok";
	}
}
