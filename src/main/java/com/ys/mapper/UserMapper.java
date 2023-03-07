package com.ys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ys.entity.User;
import org.springframework.stereotype.Repository;

/**
 * @author 杨松
 * @version V1.0
 * @package com.ys.mapper
 * @date 2023/2/4 16:07
 */
@Repository
public interface UserMapper  extends BaseMapper<User> {
}
