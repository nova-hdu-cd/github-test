package com.tuya.demo.daily.daily0805;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @author chendong
 * @date 2020/6/12 2:04 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class UserTest {
    public static void main(String[] args) throws Exception {
        //1.classLoader -> clazz
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?> clazz = classLoader.loadClass("com.tuya.demo.daily.daily0805.User");
        //2.clazz -> cons -> user
        Constructor<?> cons0 = clazz.getDeclaredConstructor();
        User user = (User) cons0.newInstance();
        System.out.println("获取空的构造器:" + user);
        Constructor<?> cons1 = clazz.getDeclaredConstructor(String.class, String.class);
        User user1 = (User) cons1.newInstance("chendong", "1176213349");
        System.out.println("获取非空的构造器:" + user1);
        //3.clazz -> setUname
        Method setUname = clazz.getMethod("setUname", String.class);
        setUname.invoke(user, "joker");
        Method setUid = clazz.getMethod("setUid", String.class);
        setUid.invoke(user, "001");
        System.out.println("获取getter setter方法" + user);

        //the 3 classloaders
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());

    }
}
