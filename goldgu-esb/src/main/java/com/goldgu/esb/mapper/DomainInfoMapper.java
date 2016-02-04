package com.goldgu.esb.mapper;

import java.util.List;

import com.goldgu.esb.model.DomainInfo;

public interface DomainInfoMapper {
    int insert(DomainInfo record);

    int insertSelective(DomainInfo record);

	List<DomainInfo> findAllDomainInfo();
}