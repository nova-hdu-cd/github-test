package com.tuya.demo.bilibili.question.c;

/**
 * 字符串碎片
 * * <p>
 */
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param str string字符串
     * @return int整型
     */
    public int GetFragment(String str) {
        // write code here

        if (str == null || str.length() == 0) {
            return 0;
        }
        char c = str.charAt(0);
        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            if (c != str.charAt(i)) {
                cnt++;
                c = str.charAt(i);
            }
        }
        int d = str.length() / cnt;
        return d;


    }
}