package com.tuya.demo.xiaomi;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author chendong
 * @date 2020/9/15 6:46 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main2 {


    public static String first(String s) {

        Map<Character, Boolean> map = new LinkedHashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, true);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : map.keySet()) {
            if (map.get(c)) {
                sb.append(c);
            }
        }

        return sb.toString();


    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            String first = first(str);
            System.out.println(first);

        }
    }

}




