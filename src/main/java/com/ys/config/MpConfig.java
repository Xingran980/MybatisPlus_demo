package com.ys.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 杨松
 * @version V1.0
 * @package com.ys.config
 * @date 2023/2/4 16:45
 */
@Configuration
public class MpConfig {
    //分页查询
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
