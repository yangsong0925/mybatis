package com.syys.web.dao.mapper;

import com.mybatis.jpa.annotation.InsertDefinition;
import com.mybatis.jpa.annotation.UpdateDefinition;
import com.syys.web.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created by ys on 2018/5/23
 */

@Mapper
@Repository
public interface UserMapper {

    @InsertDefinition
    int insert(User user);

    @InsertDefinition(selective = true)
    int insertSelective(User user);

    @UpdateDefinition(where = " user_id = #{userId}")
    int updateById(User user);

    @UpdateDefinition(selective = true, where = " user_id = #{userId}")
    int updateSelectiveById(User user);

}
