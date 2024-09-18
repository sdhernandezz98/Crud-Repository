/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crud_spring.demo.repository;

import com.crud_spring.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Wilson Hz
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
