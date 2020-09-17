package com.tuya.demo.xiaomi;

import java.util.*;

/**
 * @author chendong
 * @date 2020/9/15 6:46 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main1 {

    public static boolean test(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        if ("".equals(s)) {
            return true;
        }

        if (" ".equals(s)) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char item : s.toCharArray()) {
            if (item == '(' || item == '[' || item == '{') {
                stack.push(item);
            } else if (stack.isEmpty() || !Objects.equals(stack.pop(), map.get(item))) {
                return false;
            }
        }
        boolean ret = stack.isEmpty();

        return ret;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] str = scanner.nextLine().split(" ");
            StringBuilder sb = new StringBuilder();
            for (String s : str) {
                sb.append(s);
            }
            boolean test = test(sb.toString());
            System.out.println(test);


        }
    }

}
