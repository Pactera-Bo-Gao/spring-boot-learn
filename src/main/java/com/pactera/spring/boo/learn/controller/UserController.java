package com.pactera.spring.boo.learn.controller;

import com.pactera.spring.boo.learn.model.dto.UserDataDTO;
import com.pactera.spring.boo.learn.model.entity.User;
import com.pactera.spring.boo.learn.model.vo.UserDataVO;
import com.pactera.spring.boo.learn.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Resource
    private IUserService userService;

    @GetMapping("/user")
    public List<UserDataVO> getUserList() {
        // get
        return userService.getUserList(new UserDataDTO());
    }

    @GetMapping("/user/{id}")
    public UserDataVO getUserDetail(@PathVariable Long id) {
        // get
        UserDataDTO dto = new UserDataDTO();
        dto.setId(id);
        return userService.getUserList(dto).isEmpty() ? new UserDataVO() : userService.getUserList(dto).get(0);
    }

    @PostMapping("/user")
    public boolean addUser(@RequestBody UserDataDTO user) {
        // insert
        return userService.insertUser(user);
    }

    @PostMapping("/addUsers")
    public boolean addUsers(@RequestBody List<User> users) {
        // insert
        return userService.insertUsers(users);
    }

    @PutMapping("/user")
    public boolean updUser(@RequestBody UserDataDTO user) {
        // update
        return userService.updUser(user);
    }

    @DeleteMapping("/user/{id}")
    public Boolean delUser(@PathVariable Long id) {
        // delete
        return userService.delUser(id);
    }
}
