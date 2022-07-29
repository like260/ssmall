package test;

import com.study.pojo.User;
import com.study.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:applicationContext_mapper.xml","classpath:applicationContext_service.xml"})
public class MyTest {
    @Autowired
    UserService userService;

    @Test
    public void sel() {
        List<User> users = userService.selectUserPage("三", "男", 1, 5);
        System.out.println(users);

    }

    @Test
    public void t32() {
        System.out.println(System.currentTimeMillis() + "" + (new Random().nextInt(9000) + 1000));
    }

    @Test
    public void sell() {
        System.out.println(userService.selectUserPage(null, "男", 1, 10));
    }
}
