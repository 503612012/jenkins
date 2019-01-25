package com.oven.dao.impl;

import com.oven.dao.UserDao;
import com.oven.vo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public User get(String userName) {
        User user = new User();
        user.setId(1);
        user.setAge(18);
        user.setUserName(userName);
        return user;
    }
}
