/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserSexTypeHandler
 * Author:   Administrator
 * Date:     2018/4/3 15:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.syys.web.dao.EnumHandler;

import com.syys.web.base.enums.UserSex;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 自定义枚举处理器
 * @author Administrator
 * @create 2018/4/3
 * @since 1.0.0
 */

/**
 * setParameter：通过preparedStatement对象设置参数，将T类型的数据存入数据库。
 * getResult：通过列名或者下标来获取结果数据，也可以通过CallableStatement获取数据。
 */
public class UserSexTypeHandler implements TypeHandler<UserSex> {
    @Override
    public void setParameter(PreparedStatement preparedStatement, int i, UserSex userSex, JdbcType jdbcType) throws SQLException {
        //设置第i个参数的值为传入sex的code值，preparedStatement为执行数据库操纵的对象
        //传值的时候是一个sex对象，但是当进行映射插入的时候就会转化为sex的code值进行存储
        preparedStatement.setString(i,userSex.getCode());
    }

    @Override
    public UserSex getResult(ResultSet resultSet, String columnName) throws SQLException {
        //获取数据库存储的sex的code值
        String code = resultSet.getString(columnName);
        return UserSex.getUserSex(code);
    }

    @Override
    public UserSex getResult(ResultSet resultSet, int columnIndex) throws SQLException {
        String code = resultSet.getString(columnIndex);
        return UserSex.getUserSex(code);
    }

    @Override
    public UserSex getResult(CallableStatement callableStatement, int columnIndex) throws SQLException {
        String code = callableStatement.getString(columnIndex);
        return UserSex.getUserSex(code);
    }
}