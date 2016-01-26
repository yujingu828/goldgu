package com.goldgu.demo.mapper;

import com.goldgu.demo.model.Users;

public interface UsersMapper {
    int insert(Users record);

    int insertSelective(Users record);
}