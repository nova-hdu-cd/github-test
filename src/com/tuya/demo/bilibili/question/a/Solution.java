package com.tuya.demo.bilibili.question.a;

/**
 * 最长连续子数组
 */
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param arr int整型一维数组
     * @param k   int整型 允许0变为1的个数
     * @return int整型
     */
    public int GetMaxConsecutiveOnes(int[] arr, int k) {
        // write code here
        if (arr == null || arr.length <= 0) {
            return 0;
        }
        int l = 0;
        int z = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                z++;
            }
            while (z > k) {
                if (arr[l] == 0) {
                    l++;
                    z--;
                } else {
                    l++;
                }
            }
            max = Math.max(max, i - l + 1);
        }
        return max;
    }
}