package com.itstudy.service.impl;

import com.itstudy.dao.UserDao;
import com.itstudy.domain.User;
import com.itstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void save() {
        System.out.println("user service save...");
    }

    @Override
    public String select(Integer id) {
        User user = userDao.select(id);
        return user.toString();
    }
}
