package com.syys.web.dao.mapper;

import com.syys.web.base.enums.UserSex;
import com.syys.web.dao.EnumHandler.UserSexTypeHandler;
import com.syys.web.dao.entity.User;
import com.syys.web.dao.sql.SqlProvider;
import org.apache.ibatis.annotations.*;

import java.util.List;


public interface UserMapper {

    String SELECT_ID = "SELECT ID T_ID,USERNAME T_USERNAME,PASSWORD T_PASSWORD,NICK_NAME T_NICK_NAME,USER_SEX T_USER_SEX FROM T_USER WHERE id = #{id}";


    @Insert("INSERT INTO T_USER (id,USERNAME,PASSWORD,USER_SEX,NICK_NAME)" +
            " VALUE (#{id},#{username},#{password},#{userSex,typeHandler=com.syys.web.dao.EnumHandler.UserSexTypeHandler},#{nickName})")
    int insert(User user);

    @Insert("INSERT INTO T_USER (ID,USERNAME,PASSWORD,USER_SEX,NICK_NAME)" +
            " VALUE (#{id},#{username},#{password},#{userSex,typeHandler=com.syys.web.dao.EnumHandler.UserSexTypeHandler},#{nickName})")
    @SelectKey(statement="SELECT UUID()", keyProperty="id", before=true, resultType=String.class)
    int insertUUID(User user);

    // 改
    @Update("UPDATE T_USER SET USERNAME = #{username}, NICK_NAME = #{nickName} WHERE ID = #{id} ")
    int update(User user);


    // 改
    @Update("UPDATE T_USER SET USERNAME = #{username}, NICK_NAME = #{nickName},USER_SEX = #{userSex} WHERE ID = #{id} ")
    int updateParams(@Param("username")String username, @Param("nickName")String nickName, @Param("userSex")UserSex userSex,@Param("id")String id);


    /**
     * 此处如果不写result 列名--字段名 对应的话 会自动找名字相同的 此处我写了连接查询 只要将查询 返回的列名和类中的字段对应上就可以了
     */
    // 根据id查一条
    @Select(SELECT_ID)
    @Results(value = { @Result(property = "id", column = "T_ID"),
            @Result(property = "username", column = "T_USERNAME"),
            @Result(property = "password", column = "T_PASSWORD"),
            @Result(property = "nickName", column = "T_NICK_NAME"),
            @Result(property = "userSex", column = "T_USER_SEX",typeHandler = UserSexTypeHandler.class)
    })
    User findByid(String id);

    @Delete("DELETE FROM T_USER WHERE ID = #{id}")
    int delete(String id);

    @DeleteProvider(type = SqlProvider.class,method = "delete")
    int deleteProvider(String id);

    @SelectProvider(type = SqlProvider.class,method = "findByUserSexAndUsernameLike")
    @Results(value = { @Result(property = "id", column = "T_ID"),
            @Result(property = "username", column = "T_USERNAME"),
            @Result(property = "password", column = "T_PASSWORD"),
            @Result(property = "nickName", column = "T_NICK_NAME"),
            @Result(property = "userSex", column = "T_USER_SEX",typeHandler = UserSexTypeHandler.class)
    })
    List<User> selectProvider(String username,UserSex userSex);

    @InsertProvider(type = SqlProvider.class,method = "insertUsers")
    int insertProviders(@Param("list") List<User> users);

    @InsertProvider(type = SqlProvider.class,method = "insertUser")
    int insertProvider(User user);

}