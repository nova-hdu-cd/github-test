package com.tuya.demo.netease;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 输入N和字符S
     *
     * @param N int整型 第N+1个元素是前面N个元素之和， N>=2, N<=5
     * @param S string字符串 需要解析的字符串，字符串长度不超过1000
     * @return int整型一维数组
     */
    public int[] split_into_list(int N, String S) {
        // write code here
        String[] split = S.split("");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        boolean flag = false;
        for (int i = 0; i + 2 < arr.length; i++) {
            if (arr[i + 2] != arr[i + 1] + arr[i]) {
                return new int[0];
            }
        }
        return arr;

    }
}