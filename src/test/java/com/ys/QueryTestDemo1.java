package com.ys;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ys.entity.User;
import com.ys.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author 杨松
 * @version V1.0
 * @package com.ys
 * @date 2023/2/6 11:28
 */
@SpringBootTest
public class QueryTestDemo1 {
    //注入Mapper
    @Autowired
    private UserMapper userMapper;

    // 5 Lambdaquerywrapper
    //ge gt le lt eq ne like likeleft likeright
    @Test
    public void testlambdaquery1(){
        //创建条件构造的对象
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(User::getAge,18);
        List<User> list = userMapper.selectList(wrapper);
        System.out.println(list);
    }

    // 4 querywrapper
    //orderByDesc(降序) orderByAsc(升序)
    @Test
    public void query4(){
        //创建条件构造的对象
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("id");
        List<User> list = userMapper.selectList(wrapper);
        System.out.println(list);
    }

    //3 querywrapper
    //like likelef likeright
    @Test
    public void query3(){
        //创建条件构造的对象
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //like likeleft likeright
        wrapper.like("name","十");
        //调用方法实现条件查询
        List<User> list = userMapper.selectList(wrapper);
        System.out.println(list);
    }

    //2 用queryWrapper
    //eq ne
    @Test
    public void query2(){
        //创建条件构造的对象
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //eq ne
        wrapper.eq("age","18");
        //调用方法实现条件查询
        List<User> list = userMapper.selectList(wrapper);
        System.out.println(list);
    }

    //1 用queryWrapper
    @Test
    public void query1(){
        //创建条件构造的对象
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        //ge gt le lt
        wrapper.ge("age","20");
        //调用方法实现条件查询
        List<User> list = userMapper.selectList(wrapper);
        System.out.println(list);
    }
}
