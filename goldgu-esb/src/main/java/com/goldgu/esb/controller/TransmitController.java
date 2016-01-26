/** * TransmitController.java 
* Created on 2016年1月26日 下午1:32:41 
*/

package com.goldgu.esb.controller;

import org.apache.camel.ProducerTemplate;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
 * <p>Project: goldgu-esb</p> 
 * <p>Title: TransmitController.java</p> 
 * <p>Description: Camel转发控制器</p> 
 * @author <a href="mailto:yujingu828@163.com">Jo Yu</a>
 */
@Controller
public class TransmitController {

	@Autowired
	private ProducerTemplate producerTemplate;

	/**
	 * 转发控制器
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/{transmitId}")
	@ResponseBody
	public String transmit(@PathVariable String transmitId, @RequestBody(required = false) String param) {
		if (StringUtils.isBlank(transmitId)) { // 转移关键Id不能为空
			return "102"; // transmitId参数异常
		}

		if (StringUtils.isBlank(param)) { // 参数为空时设置为默认值
			param = "-1";
		}

		String directUrl = "direct:" + transmitId;
		String reply = producerTemplate.requestBody(directUrl, param, String.class);
		return reply;
	}
}
