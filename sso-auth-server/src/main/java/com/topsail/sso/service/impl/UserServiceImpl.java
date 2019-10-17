package com.topsail.sso.service.impl;

import com.topsail.sso.dao.UserDao;
import com.topsail.sso.domain.SysUser;
import com.topsail.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public SysUser getUserByName(String username) {
        return userDao.selectByName(username);
    }
}
