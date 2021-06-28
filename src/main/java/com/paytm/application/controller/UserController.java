/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.paytm.application.controller;

import com.paytm.application.dao.UserDao;
import com.paytm.application.model.User;
import com.paytm.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author Amit Kumar
 * @version $Id: UserController.java, v 0.1 2021-06-25 2:36 AM Exp $$ 
 */

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAllUser")
    public List<User> getStudents (){
        return userService.getStudents();
    }

    @GetMapping("/getUser/{userId}")
    public Optional<User> getStudentsById (@PathVariable("userId") Integer id ){
        return  userService.getStudentsById(id);    }


    @GetMapping("/getUserByFirstName/{userName}")
    public List<User> getStudentsByFirstName(@PathVariable("userName") String name ){
        return  userService.getAllUserByFirstName(name);
    }

    @PostMapping("/saveUser")
    public String insertUser(@RequestBody User user){
        userService.insertUser(user);
        return "New user added";

    }

    @PostMapping("/saveMultipleUser")
    public String insertMultipleUser(@RequestBody List<User> user){
        userService.insertMultipleUser(user);
        return "All New user added";

    }

    @PutMapping("/updateUser/{userId}")
    public User updateUser(@PathVariable("userId") Integer id, @RequestBody User user) throws Exception {

       return userService.updateUser(id, user);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable("userId") Integer id){
        userService.deleteUser(id);
        return "User Deleted";
    }




}