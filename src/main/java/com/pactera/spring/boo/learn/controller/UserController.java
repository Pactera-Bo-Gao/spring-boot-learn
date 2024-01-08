package com.pactera.spring.boo.learn.controller;

import com.pactera.spring.boo.learn.model.dto.UserDataDTO;
import com.pactera.spring.boo.learn.model.vo.UserDataVO;
import com.pactera.spring.boo.learn.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Resource
    private IUserService userService;

    @GetMapping("/user")
    public List<UserDataVO> getUserList() {
        // get
        List<UserDataVO> userlist = new ArrayList<UserDataVO>();
        for (int i = 1; i < 11; i++) {
            UserDataVO user = new UserDataVO();
            user.setId(i);
            user.setUsername("Xu" + i);
            userlist.add(user);
        }

        return userlist;
    }

    @GetMapping("/user/{id}")
    public UserDataVO getUserDetail(@PathVariable String id) {
        // get
        System.out.println(id);
        UserDataVO user = new UserDataVO();
        user.setId(Integer.parseInt(id));
        user.setUsername("Xu");
        return user;
    }

    @PostMapping("/user")
    public boolean addUser(@RequestBody UserDataDTO user) {
        // insert
        System.out.println(user.getUsername() + user.getPassword());
        return userService.insertUser(user);
    }

    @PutMapping("/user")
    public boolean updUser(@RequestBody UserDataDTO user) {
        // update
        System.out.println(user.getUsername() + user.getPassword());
        return true;
    }

    @DeleteMapping("/user/{id}")
    public Boolean delUser(@PathVariable String id) {
        // delete
        System.out.println(id);
        return true;
    }
}
