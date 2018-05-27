package com.syys.web.dao.sql;

import com.alibaba.druid.util.StringUtils;
import com.syys.web.base.enums.UserSex;
import com.syys.web.dao.entity.User;
import org.apache.ibatis.jdbc.SQL;

import java.text.MessageFormat;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class SqlProvider {

    public String delete(final String userId){
        return new SQL() {
            {
                DELETE_FROM("t_user");
                WHERE("id ='"+userId+"'");
            }
        }.toString();
    }

    public String findByUserSexAndUsernameLike(final String username, final UserSex userSex){
        return new SQL(){
            {
                SELECT("ID T_ID,USERNAME T_USERNAME,PASSWORD T_PASSWORD,NICK_NAME T_NICK_NAME,USER_SEX T_USER_SEX");
                FROM("t_user");
                WHERE("username like '%"+username+"%'","user_sex = "+userSex.getCode());
            }
        }.toString();
    };

    /**
     * id 自增或者实体拥有，在拼凑代码实现id，会忽略单引号''，在此方法使用 "'"+UUID.randomUUID().toString()+"'" 错误
     * MyBatis会把UserMapper的insertUsers方法中的List类型的参数存入一个Map中, 默认的key是”list”, 可以用@Param注解自定义名称, MyBatis在调用@InsertProvide指定的方法时将此map作为参数传入, 所有代码中使用List users = (List) map.get(“list”);获取list参数.
     * #{list[0].name}就表示从List参数的取第0个元素的name的值了, “list”跟key是对应的。
     * @param map
     * @return
     */
    public String insertUsers(Map map){
        List<User> users = (List<User>) map.get("list");
        StringBuilder sb = new StringBuilder();
        sb.append(" INSERT INTO T_USER ");
        sb.append(" (ID,USERNAME,PASSWORD,NICK_NAME,USER_SEX) ");
        sb.append(" VALUES ");
        MessageFormat mf = new MessageFormat("(#'{'list[{0}].id},#'{'list[{0}].nickName},#'{'list[{0}].username}," +
                "#'{'list[{0}].password},#'{'list[{0}].userSex,typeHandler=com.syys.web.dao.EnumHandler.UserSexTypeHandler})");
        for (int i = 0; i < users.size(); i++) {
            sb.append(mf.format(new Object[]{i}));
            if (i < users.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public String insertUser(final User user){
        return new SQL(){
            {
                INSERT_INTO("T_USER");
                VALUES("id","'"+UUID.randomUUID().toString()+"'");
                if (!StringUtils.isEmpty(user.getNickName())){
                    VALUES("nick_name","#{nickName}");
                }
                VALUES("username","#{username}");
                VALUES("password","#{password}");
                VALUES("user_sex","#{userSex,typeHandler=com.syys.web.dao.EnumHandler.UserSexTypeHandler}");
            }
        }.toString();
    }

}
