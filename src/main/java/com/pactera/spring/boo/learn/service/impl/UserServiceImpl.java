package com.pactera.spring.boo.learn.service.impl;

import com.pactera.spring.boo.learn.mapper.UserMapper;
import com.pactera.spring.boo.learn.model.dto.UserDataDTO;
import com.pactera.spring.boo.learn.model.entity.User;
import com.pactera.spring.boo.learn.model.vo.UserDataVO;
import com.pactera.spring.boo.learn.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean insertUser(UserDataDTO requestDto) {
        // service  insert
        User user = new User();
        BeanUtils.copyProperties(requestDto, user);
        return userMapper.insertUser(user) > 0;
    }

    @Override
    public boolean updUser(UserDataDTO requestDto) {
        User user = new User();
        BeanUtils.copyProperties(requestDto, user);
        return userMapper.updateUser(user) > 0;
    }

    @Override
    public boolean delUser(Long id) {
        return userMapper.deleteUser(id) > 0;
    }

    @Override
    public boolean insertUsers(List<User> users) {
        return userMapper.insertUsers(users) > 0;
    }

    @Override
    public List<UserDataVO> getUserList(UserDataDTO requestDto) {
        return userMapper.getUserList(requestDto);
    }
}
