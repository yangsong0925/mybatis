/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserContoller
 * Author:   Administrator
 * Date:     2018/4/2 14:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.syys.web.contoller;

import com.syys.web.dao.entity.User;
import com.syys.web.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 * @create 2018/4/2
 * @since 1.0.0
 */

@RestController
@RequestMapping("user")
public class UserContoller {
    @Resource
    private UserService userService;

    @RequestMapping(value = "find/{pageNum}/{pageSize}",method = RequestMethod.GET)
    public List<User> user(@PathVariable("pageNum") int pageNum,@PathVariable("pageSize") int pageSize){
        return userService.findUserPage(pageNum,pageSize);
    }

}