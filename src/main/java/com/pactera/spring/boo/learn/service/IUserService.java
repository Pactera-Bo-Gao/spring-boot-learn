package com.pactera.spring.boo.learn.service;

import com.pactera.spring.boo.learn.model.dto.UserDataDTO;
import com.pactera.spring.boo.learn.model.entity.User;
import com.pactera.spring.boo.learn.model.vo.UserDataVO;

import java.util.List;

public interface IUserService {
    boolean  insertUser(UserDataDTO user);

    boolean  updUser(UserDataDTO user);

    boolean  delUser(Long id);

    boolean  insertUsers(List<User> users);

    /** 获取用户列表 */
    List<UserDataVO> getUserList(UserDataDTO dto);
}
