package com.jv.basic.datatype;

import com.jv.basic.com.jv.domain.User;

public class ReferTypeTest {

    public static void main(String[] args) {
        User u = new User("jinwei", 25);
        System.out.println("转换前age="+u.getAge());
        transfer(u);
        System.out.println("转换后age="+u.getAge());
    }
    public static void transfer(User u){
        u.setAge(50);
    }

}
