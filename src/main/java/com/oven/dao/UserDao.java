package com.oven.dao;

import com.oven.vo.User;

/**
 * 用户Dao层
 *
 * @author Oven
 */
public interface UserDao {
    /**
     * 通过用户名查询
     */
    User get(String userName);

}
