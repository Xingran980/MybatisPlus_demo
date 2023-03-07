package com.ys;

import com.ys.entity.User;
import com.ys.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author 杨松
 * @version V1.0
 * @package com.ys
 * @date 2023/2/6 12:08
 */
@SpringBootTest
public class testServiceDemo {
    //注入Service
    @Autowired
    private UserService userService;

    @Test
    public void test(){
        List<User> list = userService.list();
        System.out.println(list);
    }
}
