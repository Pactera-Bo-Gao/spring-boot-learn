package com.pactera.spring.boo.learn.service;

import com.pactera.spring.boo.learn.model.dto.UserDataDTO;

public interface IUserService {
    boolean  insertUser(UserDataDTO user);
}
