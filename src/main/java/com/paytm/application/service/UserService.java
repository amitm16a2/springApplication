/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.paytm.application.service;

import com.paytm.application.dao.UserDao;
import com.paytm.application.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * @author Amit Kumar
 * @version $Id: UserService.java, v 0.1 2021-06-28 1:41 AM Exp $$ 
 */

@Service
public class UserService {

   @Autowired
   private UserDao userRepository;

    public List<User> getStudents (){
        return userRepository.findAll();
    }

    public Optional<User> getStudentsById (Integer id ){
        return  userRepository.findById(id);
    }

   public List<User> getAllUserByFirstName(String firstName){

      return userRepository.findByfirstName(firstName);
   }

    public void insertUser( User user){
        userRepository.save(user);
    }

    public void insertMultipleUser(List<User> user){
        userRepository.saveAll(user);

    }

    public User updateUser(Integer id,  User user) throws Exception {

        User userToUpdate = userRepository.findById(id).orElseThrow(Exception::new);

        userToUpdate.setEmail(user.getEmail());
        userToUpdate.setFirstName(user.getFirstName());
        userToUpdate.setLastName(user.getLastName());


        return userRepository.save(userToUpdate);
    }

    public void deleteUser(Integer id){
        userRepository.deleteById(id);
    }


}