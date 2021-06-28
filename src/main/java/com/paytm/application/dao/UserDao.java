/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.paytm.application.dao;

import com.paytm.application.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Amit Kumar
 * @version $Id: UserDao.java, v 0.1 2021-06-25 2:36 AM Exp $$ 
 */
public interface UserDao extends JpaRepository<User,Integer> {

    public List<User> findByfirstName(String firstName);
}