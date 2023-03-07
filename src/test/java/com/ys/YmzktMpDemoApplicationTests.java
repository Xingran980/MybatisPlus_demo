package com.ys;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ys.entity.User;
import com.ys.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class YmzktMpDemoApplicationTests {
    //注入Mapper
    @Autowired
    private UserMapper userMapper;
    //7 逻辑删除
    public void logicDelete(){}
    //6 批量删除
    @Test
    public void deleteBatch(){
        int rows = userMapper.deleteBatchIds(Arrays.asList(1,2));
        System.out.println(rows);
    }
    //5 id删除
    @Test
    public  void deleteId(){
        int rows = userMapper.deleteById(1621787402030874625L);
        System.out.println(rows);
    }

    //4 分页查询
    @Test
    public void findPage(){
        //创建Page对象,传递两个参数:当前页,每页显示记录数
        Page<User> page = new Page<>(1,3);
        //调用mp方法实现分页
        IPage<User> page1 = userMapper.selectPage(page,null);
        List<User> list = page.getRecords();
        System.out.println(list);
        System.out.println(page.getCurrent());
        System.out.println(page.getPages());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
        System.out.println(page.hasNext());
        System.out.println(page.hasPrevious());
    }

    //3修改操作
    @Test
    public void UpdateUser(){
        //根据id查询
        User user = userMapper.selectById(1621787402030874625L);
        //设置修改值
        user.setName("十九停哈哈");
        //调用方法实现修改
        int rows = userMapper.updateById(user);
        System.out.println(rows);
    }



    //2 添加操作
    @Test
    public void addUser(){
        User user = new User();
        user.setName("十八停");
        user.setAge(18);
        user.setEmail("test6@baomidou.com");
        int rows = userMapper.insert(user);
        System.out.println(rows);
        System.out.println(user);
    }
    //1 查询表中所有数据
    @Test
    public void findAll() {
        List<User> list = userMapper.selectList(null);
        for(User user:list){
            System.out.println(user);
        }
    }

}
