package com.tuya.demo.tonghuashun;

import java.util.Arrays;

/**
 * @author chendong
 * @date 2020/9/5 11:14 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main3 {

    public static boolean include(String str1, String str2) {

        char[] chars = str1.toCharArray();
        Arrays.sort(chars);
        str1 = new String(chars);

        StringBuilder sb = new StringBuilder();
        sb.append(str2);

        return str1.contains(sb);

    }
}
