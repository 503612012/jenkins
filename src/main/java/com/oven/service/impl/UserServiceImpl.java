package com.oven.service.impl;

import com.oven.dao.UserDao;
import com.oven.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements com.oven.service.UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User get(String userName) {
        return userDao.get(userName);
    }
}
