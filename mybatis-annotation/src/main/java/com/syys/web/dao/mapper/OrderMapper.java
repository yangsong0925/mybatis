package com.syys.web.dao.mapper;

import com.syys.web.dao.entity.Order;
import com.syys.web.dao.entity.OrderDetail;
import com.syys.web.dao.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

public interface OrderMapper {

    //   <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<    一对一    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    @Select("select * from t_order where id=#{id}")
    @Results({
            @Result(id=true,property="id",column="id"),
            @Result(property="name",column="name"),
            @Result(property="user",column="user_id",javaType=User.class,
                    one=@One(select="com.syys.web.dao.mapper.UserMapper.findByid"))
    })
    Order findByIdAndUser(int orderId);

    //   <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<    一对一  and 一对多   >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    @Select("select * from t_order where id=#{id}")
    @Results({
            @Result(id=true,property="id",column="id"),
            @Result(property="name",column="name"),
            @Result(property="user",column="user_id",javaType=User.class,one=@One(select="com.syys.web.dao.mapper.UserMapper.findByid")),
            @Result(property="orderDetails",column="id",javaType=List.class,many=@Many(select="com.syys.web.dao.mapper.OrderMapper.findDetailByOrderId",fetchType = FetchType.LAZY))
    })
    Order findByIdAndUserAndOrderDetail(int orderId);

    @Select("SELECT OD.ID detailId,OD.ITEMS_ID itemsId,OD.ITEMS_NUM itemsNum,OD.ORDER_ID orderId FROM T_ORDER_DETAIL OD WHERE OD.ORDER_ID = #{id}")
    @Results({
            @Result(id=true,property="id",column="detailId"),
            @Result(property="itemsId",column="itemsId"),
            @Result(property="itemsNum",column="itemsNum"),
            @Result(property="ordersId",column="ordersId")
    })
    List<OrderDetail> findDetailByOrderId(int orderId);
}