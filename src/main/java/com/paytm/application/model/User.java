/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.paytm.application.model;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;

/**
 * @author Amit Kumar
 * @version $Id: User.java, v 0.1 2021-06-25 2:34 AM Exp $$ 
 */
@Entity
@Table (name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>firstName</tt>.
     *
     * @return property value of firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter method for property <tt>firstName</tt>.
     *
     * @param firstName value to be assigned to property firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter method for property <tt>lastName</tt>.
     *
     * @return property value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter method for property <tt>lastName</tt>.
     *
     * @param lastName value to be assigned to property lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter method for property <tt>email</tt>.
     *
     * @return property value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for property <tt>email</tt>.
     *
     * @param email value to be assigned to property email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}