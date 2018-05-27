package com.syys.web.dao.mapper;

import com.syys.web.dao.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.Table;
import java.util.List;

/**
 * Created by ys on 2018/5/23
 */
@Repository
//@MapperDefinition(domainClass = User.class)
//@Table(name = "t_user")
// extends mybatisbase
public interface UserMapper {

    List<User> findAll();

    int addUser(User user);

}
