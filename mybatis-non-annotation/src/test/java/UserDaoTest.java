import com.syys.web.dao.mapper.UserMapper;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

//    @Test
//    public void addUser(){
//        for (int i = 1; i <= 100; i++) {
//            User user = new User();
//            user.setNickName("帅哥"+i);
//            user.setUsername("ys"+i);
//            if ( i%2==0 )
//                user.setUserSex(UserSex.MAN);
//            else
//                user.setUserSex(UserSex.WOMAN);
//            user.setPassword(i+"");
//            userMapper.addUser(user);
//        }
//    }

//    @Test
//    public void addUsers(){
//        List<User> users = new ArrayList<>();
//        User user = new User();
//        user.setNickName("帅哥");
//        user.setUsername("ys");
//        user.setUserSex(UserSex.MAN);
//        user.setPassword("123456");
//        users.add(user);
//
//        user = new User();
//        user.setNickName("美女");
//        user.setUsername("zxf");
//        user.setUserSex(UserSex.WOMAN);
//        user.setPassword("123456");
//        users.add(user);
//
//        System.out.println(userMapper.addUsers(users));
//        for (int i = 0; i < users.size(); i++) {
//            System.out.println(users.get(i).getId());
//        }
//    }

//    @Test
//    public void findUser(){
//        System.out.println(userMapper.findUser());
//    }



}