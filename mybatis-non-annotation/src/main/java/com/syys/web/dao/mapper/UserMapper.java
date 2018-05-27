package com.syys.web.dao.mapper;


import com.syys.web.dao.entity.User;

import java.util.List;


public interface UserMapper {

    User findUserById(String id);
    List<User> findUserByLikeUsername(String username);
    int addUser(User user);


//    public int addUser(User user);
//    public int addUsers(List<User> users);
//    public List<User> findUser();

}