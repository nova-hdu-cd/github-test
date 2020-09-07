package com.tuya.demo.netease;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author chendong
 * @date 2020/9/5 3:24 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main1 {

    public static class User {
        private String userId;
        private String userName;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = sc.nextLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        List<User> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().split(" ");
            User u = new User();
            u.setUserId(s[0]);
            u.setUserName(s[1]);
            res.add(u);
        }

        Map<String, List<User>> collect = res.stream()
                .collect(Collectors.groupingBy(User::getUserName));
        int cnt = 0;
        for (Map.Entry<String, List<User>> entry : collect.entrySet()) {
            int size = entry.getValue().size();
            if (size < 2) {
                cnt++;
            }
        }

        System.out.println(collect.size() - cnt);
    }

}
