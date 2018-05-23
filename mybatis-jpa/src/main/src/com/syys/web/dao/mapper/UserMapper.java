package com.syys.web.dao.mapper;

import com.syys.web.dao.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ys on 2018/5/23
 */
@Repository
public interface UserMapper {

    List<User> findAll();

    int addUser(User user);

}
