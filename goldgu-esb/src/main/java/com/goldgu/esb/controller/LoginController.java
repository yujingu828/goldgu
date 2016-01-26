/** * LoginController.java 
* Created on 2016年1月26日 上午11:26:45 
*/

package com.goldgu.esb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/** 
 * <p>Project: goldgu-esb</p> 
 * <p>Title: LoginController.java</p> 
 * <p>Description: 登录 </p> 
 * @author <a href="mailto:yujingu828@163.com">Jo Yu</a>
 */
@Controller
public class LoginController {
	
	/**
	 * 进入登录页
	 * @return
	 */
	@RequestMapping(value = "/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");

		return mav;
	}

	/**
	 * 登录
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("login");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		if("admin".equals(userName) && "admin".equals(password)) {
			mav.setViewName("main");
		}

		return mav;
	}
}
