package com.isoftstone.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("user")
public class User implements Serializable {

    @TableId(type = IdType.AUTO,value = "id")
    private Integer id;

    private String name;

    private String password;
}
