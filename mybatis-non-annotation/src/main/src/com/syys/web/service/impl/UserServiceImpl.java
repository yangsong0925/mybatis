/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserServiceImpl
 * Author:   Administrator
 * Date:     2018/4/2 14:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.syys.web.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syys.web.dao.entity.User;
import com.syys.web.dao.mapper.UserMapper;
import com.syys.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 * @create 2018/4/2
 * @since 1.0.0
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUserPage(int pageNum, int pageSize) {
        PageHelper.startPage(1,10,true);
        List<User> users = userMapper.findUser();
        PageInfo<User> pageInfo = new PageInfo<User>(users);
        return pageInfo.getList();
    }
}