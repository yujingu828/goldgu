/** * DomainInfoController.java 
* Created on 2016年1月26日 下午5:51:34 
*/

package com.goldgu.esb.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.goldgu.esb.base.Constant;
import com.goldgu.esb.model.DomainInfo;
import com.goldgu.esb.service.DomainInfoService;

/** 
 * <p>Project: goldgu-esb</p> 
 * <p>Title: DomainInfoController.java</p> 
 * <p>Description: </p> 
 * @author <a href="mailto:yujingu828@163.com">Jo Yu</a>
 */
@Controller
public class DomainInfoController {
	
	@Autowired
	private DomainInfoService domainInfoService;
	
	/**
	 * 获取系统域名信息
	 * @return
	 */
	@RequestMapping(value = "/listDomainInfo")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("domain_info_list");
		List<DomainInfo> list = domainInfoService.findAllDomainInfo();
		mav.addObject("list", list);
		return mav;
	}
	
	/**
	 * 新增系统域名
	 * @return
	 */
	@RequestMapping(value = "/addDomainInfo", method = RequestMethod.POST)
	public ModelAndView addDomainInfo(DomainInfo domainInfo) {
		ModelAndView mav = new ModelAndView("domain_info_list");
		Map<?, ?> map = domainInfoService.addDomainInfo(domainInfo);
		String msgStatus = (String) map.get("msgStatus");
		if (Constant.MSG_STATUS_1.equals(msgStatus)) {
			mav.addObject("msg", "保存成功！");
		} else {
			mav.addObject("msg", "保存失败！");
		}
		
		mav.addObject("list", map.get("list"));
		
		return mav;
	}
}
