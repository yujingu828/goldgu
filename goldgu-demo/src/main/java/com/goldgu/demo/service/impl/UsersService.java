/** * UsersService.java 
* Created on 2016年1月20日 下午2:31:19 
*/

package com.goldgu.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goldgu.demo.mapper.UsersMapper;
import com.goldgu.demo.model.Users;
import com.goldgu.demo.service.UsersServcie;

/** 
 * <p>Project: goldgu-demo</p> 
 * <p>Title: UsersService.java</p> 
 * <p>Description: 用户业务逻辑 </p> 
 * @author <a href="mailto:yujingu828@163.com">Jo Yu</a>
 */
@Service
public class UsersService implements UsersServcie {

	@Autowired
	private UsersMapper usersMapper;
	
	public void insertUser() {
		Users user = new Users();
		user.setId(1);
		user.setName("test");
		user.setAge(20);
		
		usersMapper.insert(user);
	}
}
