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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
    public void add(){
        User user = new  User();
        user.setId(UUID.randomUUID().toString());
        user.setNickName("帅哥");
        user.setUsername("ys");
        user.setUserSex(UserSex.MAN);
        user.setPassword("123456");
        System.out.println(userMapper.insert(user));
    }

    @Test
    public void addUUID(){
        User user = new  User();
        user.setNickName("帅哥");
        user.setUsername("ys");
        user.setUserSex(UserSex.MAN);
        user.setPassword("123456");
        System.out.println(userMapper.insertUUID(user));
        System.out.println(user);
    }

    @Test
    public void updateByUser(){
        User user = new  User();
        user.setId("583ce21e-5f53-11e8-acb3-4ccc6ae0a51e");
        user.setNickName("帅帅帅");
        user.setUsername("帅帅帅");
        user.setUserSex(UserSex.MAN);
        user.setPassword("123456");
        System.out.println(userMapper.update(user));
        System.out.println(user);
    }

    @Test
    public void updateParams(){
        System.out.println(userMapper.updateParams("1111","11111",UserSex.MAN,"583ce21e-5f53-11e8-acb3-4ccc6ae0a51e"));
    }

    @Test
    public void findById(){
        System.out.println(userMapper.findByid("583ce21e-5f53-11e8-acb3-4ccc6ae0a51e"));
    }


    @Test
    public void deleteProvider(){
        System.out.println(userMapper.deleteProvider("583ce21e-5f53-11e8-acb3-4ccc6ae0a51e"));
    }

    @Test
    public void selectProvider(){
        System.out.println(userMapper.selectProvider("y",UserSex.MAN));
    }

    @Test
    public void insertProviders(){
        List<User> users = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            User user = new User();
            user.setId(UUID.randomUUID().toString());
            user.setNickName("帅哥"+i);
            user.setUsername("ys"+i);
            if ( i%2==0 )
                user.setUserSex(UserSex.MAN);
            else
                user.setUserSex(UserSex.WOMAN);
            user.setPassword(String.valueOf(i));
            users.add(user);
        }
        userMapper.insertProviders(users);
    }

    @Test
    public void insertProvider(){
        User user = new User();
        user.setNickName("帅哥");
        user.setUsername("ys");
        user.setUserSex(UserSex.WOMAN);
        user.setPassword("mmp");
        userMapper.insertProvider(user);
    }

    //   <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<    一对一    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    @Test
    public void oneToOne(){
        System.out.println(orderMapper.findByIdAndUser(1));
    }

    @Test
    public void oneToMany(){
        Order order = orderMapper.findByIdAndUserAndOrderDetail(1);
        System.out.println(order);
    }

}