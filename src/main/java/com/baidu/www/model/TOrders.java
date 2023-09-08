package com.baidu.www.model;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("t_orders")
public class TOrders {
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TOrders() {
    }

    public TOrders( String name) {
        this.name = name;
    }
}
