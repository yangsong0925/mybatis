/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CallMapper
 * Author:   Administrator
 * Date:     2018/4/2 16:56
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.syys.web.dao.mapper;

import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 存储过程 存储函数 调用测试
 * @author Administrator
 * @create 2018/4/2
 * @since 1.0.0
 */
@Repository
public interface CallMapper {

    //查询存储过程的方法
    public void callProcedure(Map map);

    //查询函数的方法
    public void callFunction(Map map);

}