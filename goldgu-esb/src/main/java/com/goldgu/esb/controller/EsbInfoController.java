/** * EsbInfoController.java 
* Created on 2016年1月26日 下午5:51:20 
*/

package com.goldgu.esb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.goldgu.esb.service.EsbInfoService;

/** 
 * <p>Project: goldgu-esb</p> 
 * <p>Title: EsbInfoController.java</p> 
 * <p>Description: </p> 
 * @author <a href="mailto:yujingu828@163.com">Jo Yu</a>
 */
@Controller
public class EsbInfoController {

	@Autowired
	private EsbInfoService esbInfoService;
}
