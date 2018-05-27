import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syys.web.base.enums.UserSex;
import com.syys.web.dao.entity.Order;
import com.syys.web.dao.entity.User;
import com.syys.web.dao.mapper.CallMapper;
import com.syys.web.dao.mapper.OrderMapper;
import com.syys.web.dao.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ys on 2018/5/23
 */
@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations={"classpath:spring/applicationContext-*.xml","classpath:spring/spring-mvc.xml"}) //加载配置文件
public class ApplicationTest {

    @Resource
    private UserMapper userMapper;
    @Resource
    private CallMapper callMapper;
    @Resource
    private OrderMapper orderMapper;

    @Test
    public void findEq(){
        User user = userMapper.findUserById("583ce21e-5f53-11e8-acb3-4ccc6ae0a51e");
        System.out.println(user);
    }

    @Test
    public void findLike(){
        List<User> users = userMapper.findUserByLikeUsername("y");
        System.out.println(users);
    }

    @Test
    public void addUser(){
        User user = new  User();
        user.setNickName("帅哥");
        user.setUsername("ys");
        user.setUserSex(UserSex.MAN);
        user.setPassword("123456");
        System.out.println(userMapper.addUser(user));
        System.out.println(user);
    }

//    存储过程调用
    @Test
    public void procedure(){
        Map map = new HashMap();
        callMapper.callProcedure(map);
        System.out.println(map);
    }

    @Test
    public void testPageHelper(){
        // 设置分页条件，Parameters:pageNum 页码pageSize 每页显示数量count 是否进行count查询
        // PageHelper.startPage() 绑定当前线程    随后第一条查询进行分页
        PageHelper.startPage(1, 3, true);
        List<User> users = null; //userMapper.findUser();
        PageInfo<User> pageInfo = new PageInfo<>(users);

        //4.取分页信息。使用PageInfo对象取。
        System.out.println("总记录数：" + pageInfo.getTotal());
        System.out.println("总记页数：" + pageInfo.getPages());
        System.out.println("返回的记录数：" + users.size());
        System.out.println("最后一页：" + pageInfo.getLastPage());
        users = pageInfo.getList();
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }

    //   <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<    一对一    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    @Test
    public void findOrder(){
        System.out.println(orderMapper.findOrderAndUser(1));
    }

    //   <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<    一对多    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    @Test
    public void findOrderDetails(){
        Order order = orderMapper.findOrderAndUserAndOrderDetail(1);
        System.out.println(order);
    }

}
