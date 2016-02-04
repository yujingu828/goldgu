/** * EsbInfoImpl.java 
* Created on 2016年1月26日 下午5:50:43 
*/

package com.goldgu.esb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldgu.esb.mapper.EsbInfoMapper;
import com.goldgu.esb.service.EsbInfoService;

/** 
 * <p>Project: goldgu-esb</p> 
 * <p>Title: EsbInfoImpl.java</p> 
 * <p>Description: </p> 
 * @author <a href="mailto:yujingu828@163.com">Jo Yu</a>
 */
@Service
public class EsbInfoServiceImpl implements EsbInfoService {
	
	@Autowired
	private EsbInfoMapper esbInfoMapper;
}
