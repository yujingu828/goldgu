/** * DomainInfo.java 
* Created on 2016年1月26日 下午5:49:35 
*/

package com.goldgu.esb.service;

import java.util.List;
import java.util.Map;

import com.goldgu.esb.model.DomainInfo;

/** 
 * <p>Project: goldgu-esb</p> 
 * <p>Title: DomainInfo.java</p> 
 * <p>Description: </p> 
 * @author <a href="mailto:yujingu828@163.com">Jo Yu</a>
 */

public interface DomainInfoService {

	List<DomainInfo> findAllDomainInfo();

	/**
	 * 新增系统域名
	 * @param domainInfo
	 * @return
	 */
	Map<String, Object> addDomainInfo(DomainInfo domainInfo); 

}
