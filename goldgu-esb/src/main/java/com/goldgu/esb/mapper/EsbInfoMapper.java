package com.goldgu.esb.mapper;

import com.goldgu.esb.model.EsbInfo;

public interface EsbInfoMapper {
    int insert(EsbInfo record);

    int insertSelective(EsbInfo record);
}