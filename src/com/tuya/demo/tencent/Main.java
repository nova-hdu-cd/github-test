package com.tuya.demo.tencent;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] line = sc.nextLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);
            String[] s = sc.nextLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }

            System.out.println(1 + " " + 2);
            System.out.println(2 + " " + 1);
            System.out.println(2 + " " + 1);
            System.out.println(3 + " " + 1);


        }

    }

    public static String showCount(String str) {
        //1.将字符串转换成相应的字符数组 。 用TreeMap进行相应的接收。
        char[] charArr = str.toCharArray();
        Map<Character, Integer> map = new TreeMap<Character, Integer>();
        for (char c : charArr) {  //对每一个字符进行相关的判断。
            //2. 对传入的字符进行判断。如果不是a-z或者A-Z 就不判断。
            if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')) {
                continue;
            }
            //3.是的话，就从map中判断，看是否能够取出。
            Integer count = map.get(c); //看数目。
            if (count == null) {  //即没有取出来。
                map.put(c, 1);
            } else {
                map.put(c, count + 1);
            }
        }
        return mapToString(map);
    }

    //将Map转换成相对应的字符串进行输出。
    public static String mapToString(Map<Character, Integer> map) {
        StringBuilder sb = new StringBuilder();
        //需要遍历一下这个map.
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            sb.append(m.getKey() + "(" + m.getValue() + ")");
        }
        return sb.toString();
    }
}

