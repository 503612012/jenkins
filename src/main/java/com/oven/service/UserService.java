package com.oven.service;

import com.oven.vo.User;

/**
 * 用户服务层
 *
 * @author Oven
 */
public interface UserService {

    User get(String userName);

}
