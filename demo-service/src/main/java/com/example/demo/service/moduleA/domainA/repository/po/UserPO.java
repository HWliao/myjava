package com.example.demo.service.moduleA.domainA.repository.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * 测试用User用户
 *
 * @author HWliao
 */
@Data
@Builder
@TableName("user")
public class UserPO implements Serializable {
    private static final long serialVersionUID = 8954391583331738412L;
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
