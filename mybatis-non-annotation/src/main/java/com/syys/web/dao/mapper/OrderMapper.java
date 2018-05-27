package com.syys.web.dao.mapper;


import com.syys.web.dao.entity.Order;


public interface OrderMapper {

    Order findOrderAndUser(int orderId);

    Order findOrderAndUserAndOrderDetail(int orderId);
}