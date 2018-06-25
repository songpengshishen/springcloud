package com.wsp.springcloud.web.controller;

import com.wsp.springcloud.privoder.dao.UserRepository;
import com.wsp.springcloud.privoder.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户控制器
 */
@RestController
public class UserController {

  @Autowired
  private UserRepository userRepository;

  @GetMapping("/{id}")
  public User findById(@PathVariable long id){
    return this.userRepository.findOne(id);
  }
}
