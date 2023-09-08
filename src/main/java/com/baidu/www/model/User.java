package com.baidu.www.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String username;
    private Integer age;
    private Integer sex;
    private boolean isVip;
    private Date createTime;
    private List<String> tags;
}