package com.syys.web.dao.mapper;


import com.syys.web.dao.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    public int addUser(User user);

    public int addUsers(List<User> users);

    public List<User> findUser();

}