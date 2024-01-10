package com.pactera.spring.boo.learn.mapper;

import com.pactera.spring.boo.learn.model.dto.UserDataDTO;
import com.pactera.spring.boo.learn.model.entity.User;
import com.pactera.spring.boo.learn.model.vo.UserDataVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    List<UserDataVO> getUserList(@Param("req") UserDataDTO requestDto);

    int insertUser(@Param("user") User user);

    int insertUsers(@Param("users") List<User> users);

    int updateUser(@Param("user") User user);

    int deleteUser(@Param("id") Long id);
}
