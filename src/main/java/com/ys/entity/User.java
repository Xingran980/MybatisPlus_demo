package com.ys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

/**
 * @author 杨松
 * @version V1.0
 * @package com.ys.entity
 * @date 2023/2/4 16:04
 */
@Data

public class User {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    //逻辑删除标志
    @TableLogic
    private Integer deleted;
}
