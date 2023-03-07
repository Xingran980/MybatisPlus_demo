package com.ys.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ys.entity.User;
import com.ys.mapper.UserMapper;
import com.ys.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author 杨松
 * @version V1.0
 * @package com.ys.service.impl
 * @date 2023/2/6 11:57
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
