/** * DomainInfoImpl.java 
* Created on 2016年1月26日 下午5:50:24 
*/

package com.goldgu.esb.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldgu.esb.base.Constant;
import com.goldgu.esb.mapper.DomainInfoMapper;
import com.goldgu.esb.model.DomainInfo;
import com.goldgu.esb.service.DomainInfoService;
import com.google.common.collect.Maps;

/** 
 * <p>Project: goldgu-esb</p> 
 * <p>Title: DomainInfoImpl.java</p> 
 * <p>Description: </p> 
 * @author <a href="mailto:yujingu828@163.com">Jo Yu</a>
 */
@Service
public class DomainInfoServiceImpl implements DomainInfoService {

	@Autowired
	private DomainInfoMapper domainInfoMapper;

	@Override
	public List<DomainInfo> findAllDomainInfo() {
		List<DomainInfo> list = domainInfoMapper.findAllDomainInfo();
		return list;
	}

	/**
	 * 新增系统域名
	 * @param domainInfo
	 * @return
	 */
	@Override
	public Map<String, Object> addDomainInfo(DomainInfo domainInfo) {
		Map<String, Object> map = Maps.newHashMap();
		List<DomainInfo> list = new ArrayList<DomainInfo>();
		String msgStatus = Constant.MSG_STATUS_0;
		
		/**
		 * 新增业务处理
		 */
		int result = domainInfoMapper.insertSelective(domainInfo);
		if (result > 0) {
			msgStatus = Constant.MSG_STATUS_1;
			List<DomainInfo> resultList = domainInfoMapper.findAllDomainInfo();
			if (resultList != null && resultList.size() > 0) {
				list = resultList;
			}
		}
		
		map.put("msgStatus", msgStatus);
		map.put("list", list);
		
		return map;
	}
}
