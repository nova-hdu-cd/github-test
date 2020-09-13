package com.tuya.demo.netease.b;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 使用题目中描述的方法，将 raw_str 压缩后返回
     *
     * @param raw_str string字符串 未压缩的原始字符串
     * @return string字符串
     */
    public String compress(String raw_str) {
        // write code here
        String tmp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int len = raw_str.length();

        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < len && j < len) {
            int cnt = 0;
            while (j < len && raw_str.charAt(i) == raw_str.charAt(j)) {
                j++;
                cnt++;
            }
            if (cnt <= 3) {
                for (int m = 0; m < cnt; m++) {
                    sb.append(raw_str.charAt(i++));
                }
            } else if (cnt > 3) {
                while (cnt > 3) {
                    sb.append("0" + tmp.charAt(cnt - 4) + raw_str.charAt(i));
                    cnt -= 52;
                }
                if (cnt <= 3) {
                    for (int k = 0; k < cnt; k++) {
                        sb.append(raw_str.charAt(i));
                    }
                }
                i = j;
            }
        }
        return sb.toString();
    }
}