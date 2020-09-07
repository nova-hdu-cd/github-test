package com.tuya.demo.tonghuashun;

/**
 * @author chendong
 * @date 2020/9/5 10:46 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main1 {

    public static int getStrNum(String str, char c) {
        char[] chars = str.toCharArray();
        int cnt = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c || chars[i] - c == 32 || chars[i] - c == -32) {
                cnt++;
            }
        }
        return cnt;
    }
}
