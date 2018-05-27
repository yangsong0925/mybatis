import com.syys.web.dao.entity.User;
import com.syys.web.dao.mapper.UserMapper;
import com.syys.web.enums.UserSex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

import javax.annotation.Resource;
import java.io.FileNotFoundException;

/**
 * Created by ys on 2018/5/23
 */
@RunWith(SpringJUnit4ClassRunner.class) //使用junit4进行测试
@ContextConfiguration(locations={"classpath:spring/applicationContext-*.xml","classpath:spring/spring-mvc.xml"}) //加载配置文件
public class ApplicationTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void fun01(){
        System.out.println(userMapper);
        User user = new User();
        user.setNickName("无敌帅");
        user.setPassword("111");
        user.setUsername("ys");
        user.setUserSex(UserSex.MAN);
        System.out.println(userMapper.addUser(user));
    }

}
