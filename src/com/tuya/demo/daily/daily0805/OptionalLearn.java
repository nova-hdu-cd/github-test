package com.tuya.demo.daily.daily0805;

import java.util.*;

/**
 * jdk 1.8引入的optional容器防止npe
 *
 * @author chendong
 * @date 2020/7/17 11:37 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class OptionalLearn {

    /**
     * 默认用户
     */
    private static User defaultUser = new User("chendong", "sx294");

    public static void test1() {
        User user = new User();
        user = null;

        //当u为null时，抛NPE空指针异常
        //System.out.println(Optional.of(user));

        //当u为null时，Optional.empty，抛NoSuchElementException
        System.out.println(Optional.ofNullable(user));
    }

    public static void test2() throws Exception {

        User user = new User();

        //当user为null时，执行orElse orElseGet orElseThrow方法
        //user = null;
        User u2 = Optional.ofNullable(user).orElse(sayHello());
        User u3 = Optional.ofNullable(user).orElseGet(OptionalLearn::sayHello);
        User u4 = Optional.ofNullable(user).orElseThrow(() -> new Exception("用户不存在"));

        System.out.println(u2);
        System.out.println(u3);
        System.out.println(u4);
    }

    public static void test3() {
        User user1 = new User();
        user1.setUserName("xiaohong");
        User user2 = new User();
        user2.setUserName("chendong222");
        User user3 = new User();
        user3.setUserName("chendong333");
        List<User> userList = Arrays.asList(user1, user2, user3);
        userList = null;

        //实际编程中，userList可能为空，也可能不为空，这种逻辑经常出现

        Optional.ofNullable(userList)
                //userList为空走这里的逻辑
                .orElseGet(() -> Arrays.asList(defaultUser))
                //这里userList一定不为空了
                .stream()
                .map(u -> {
                    Student s = new Student();
                    s.setName(u.getUserName());
                    if ("xiaohong".equals(u.getUserName())) {
                        s.setSex("女");
                    } else {
                        s.setSex("男");
                    }
                    return s;
                })
                .sorted(Comparator.comparing(Student::getName))
                .forEach(System.out::println);


    }

    public static void test4(List<String> numenFamilyList) {

        Optional.ofNullable(numenFamilyList)
                .orElse(Collections.EMPTY_LIST)
                .stream()
                .filter((s) -> s != null)
                .filter((s) -> s.equals("hello"))
                .forEach(System.out::println);

    }

    public static void main(String[] args) throws Exception {
        test4(null);
    }

    public static User sayHello() {
        return new User("chendong", "sx294");
    }

    static class Student {

        private String name;
        private String sex;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", sex='" + sex + '\'' +
                    '}';
        }
    }

    static class User {
        private String userName;
        private String userId;

        public User() {
        }

        public User(String userName, String userId) {
            this.userName = userName;
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        @Override
        public String toString() {
            return "User{" +
                    "userName='" + userName + '\'' +
                    ", userId='" + userId + '\'' +
                    '}';
        }
    }

}
