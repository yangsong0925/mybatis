package com.syys.web.service;

import com.syys.web.dao.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/4/2.
 */
public interface UserService {

    public List<User> findUserPage(int pageNum, int pageSize);

}
