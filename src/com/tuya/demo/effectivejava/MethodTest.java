package com.tuya.demo.effectivejava;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author chendong
 * @date 2020/6/10 2:06 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class MethodTest {

    private static void show(int a) {
        assert a > 0;
        System.out.println(a);
    }

    private static boolean contains9(int a) {
        return a == 9;
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-2);
        list.add(3);
        list.add(9);

        //stream API
        //stream().sorted() 传入比较器
        list.stream().sorted((o1, o2) -> o1 - o2).forEach(System.out::println);
        list.stream().sorted(Integer::compare).forEach(System.out::println);
        System.out.println("=======================");
        //stream().filter() 传入过滤逻辑
        list.stream().filter(MethodTest::contains9).forEach(System.out::println);
        System.out.println("=======================");
        //stream().map() 传入处理元素的操作
        list.stream().sorted(Integer::compare).map(a -> a + 1).forEach(System.out::println);

        System.out.println("list");
        List<User> userList = new ArrayList<>();
        userList.add(new User("jack", "01"));
        userList.add(new User("rose", "02"));
        userList.add(new User("mike", "03"));

        //list -> map
        Map<String, String> map = userList.stream().collect(Collectors.toMap(User::getUname, User::getUid));
        System.out.println("list -> map");
        map.forEach((k, v) -> {
            k = k.toUpperCase();
            v = " " + v;
            System.out.println(k + ":" + v);
        });

        //list<User> -> list<Account>
        List<Account> collect = userList.stream().map(user -> new Account(user.getUname(), user.getUid())).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);

        //map -> list
        map.entrySet().stream().forEach(System.out::println);
        map.keySet().stream().forEach(System.out::println);
        map.values().stream().forEach(System.out::println);
    }

    private static class User {
        private String uname;
        private String uid;

        public User(String uname, String uid) {
            this.uname = uname;
            this.uid = uid;
        }

        public String getUname() {
            return uname;
        }

        public void setUname(String uname) {
            this.uname = uname;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }
    }

    private static class Account {
        private String name;
        private String id;

        public Account(String name, String id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "name='" + name + '\'' +
                    ", id='" + id + '\'' +
                    '}';
        }
    }
}
