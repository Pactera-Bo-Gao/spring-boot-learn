package com.pactera.spring.boo.learn.service.impl;

import com.pactera.spring.boo.learn.model.dto.UserDataDTO;
import com.pactera.spring.boo.learn.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Override
    public boolean insertUser(UserDataDTO user) {
        // service  insert
        System.out.println(user.getUsername());
        return true;
    }
}
