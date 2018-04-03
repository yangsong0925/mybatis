import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.syys.web.base.enums.UserSex;
import com.syys.web.dao.entity.User;
import com.syys.web.dao.mapper.CallMapper;
import com.syys.web.dao.mapper.UserMapper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Administrator
 * @create 2018/4/2
 * @since 1.0.0
 */
public class UserDaoTest {

    private ApplicationContext ctx;
    private UserMapper userMapper;

    @Before
    public void setUp() throws Exception{
        ctx = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        userMapper = ctx.getBean(UserMapper.class);
    }

    @Test
    public void pocedure(){
        CallMapper callMapper = ctx.getBean(CallMapper.class);
        Map map = new HashMap();
        callMapper.callProcedure(map);
        System.out.println(map);
    }

    @Test
    public void addUser(){
        for (int i = 1; i <= 100; i++) {
            User user = new User();
            user.setNickName("帅哥"+i);
            user.setUsername("ys"+i);
            if ( i%2==0 )
                user.setUserSex(UserSex.MAN);
            else
                user.setUserSex(UserSex.WOMAN);
            user.setPassword(i+"");
            userMapper.addUser(user);
        }
    }

    @Test
    public void addUsers(){
        List<User> users = new ArrayList<User>();
        User user = new User();
        user.setNickName("帅哥");
        user.setUsername("ys");
        user.setUserSex(UserSex.MAN);
        user.setPassword("123456");
        users.add(user);

        user = new User();
        user.setNickName("美女");
        user.setUsername("zxf");
        user.setUserSex(UserSex.WOMAN);
        user.setPassword("123456");
        users.add(user);

        System.out.println(userMapper.addUsers(users));
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getId());
        }
    }

    @Test
    public void findUser(){
        System.out.println(userMapper.findUser());
    }

    @Test
    public void testPageHelper(){
        //设置分页条件，Parameters:pageNum 页码pageSize 每页显示数量count 是否进行count查询
        PageHelper.startPage(1, 3, true);
        List<User> users = userMapper.findUser();
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

}