package com.wsp.springcloud.privoder.dao;

import com.wsp.springcloud.privoder.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * 用户存储
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{
}
