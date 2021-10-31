package com.xiang;

import lombok.Data;

@Data
public class User {
    private String name;

    static {
        System.out.println("User 类被加载了");
    }

    public User(){
        System.out.println("User 当前实例被创建了");
    }

    @Override
    protected void finalize() {
        System.out.println("User 当前示例被销毁了...");
    }
}
