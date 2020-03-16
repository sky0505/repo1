package com.jv.basic.proxy;

import com.jv.basic.com.jv.domain.IUser;
import com.jv.basic.com.jv.domain.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


public class ProxyTest {
    public static void main(String[] args) {
        User user = new User("金威", 25);
//    获取一个User的代理对象proxyUser
        IUser proxyUser = (IUser)Proxy.newProxyInstance(user.getClass().getClassLoader(),
                user.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object rtValue=null;
                        double money = (double) args[0];
                        String methodName = method.getName();
                        if(("getMoney").equals(methodName)){
                            rtValue = method.invoke(user,money/2);
                            System.out.println("代理对象中invoke方法：，，"+rtValue);
                        }
                        return rtValue;
                    }
                });

        proxyUser.getMoney(5000);

    }


}
