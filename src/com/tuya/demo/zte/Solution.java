package com.tuya.demo.zte;

public class Solution {
    
    public static int getNum(int[] arr) {
        int res1 = 0;
        int res2 = 0;
        int len = arr.length;
        int[] f = new int[len];// 升序
        int[] g = new int[len];// 降序

        for (int i = 0; i < len; i++) {
            g[i] = 1;
            f[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    f[i] = Math.max(f[i], f[j] + 1);
                }
                if (arr[j] > arr[i]) {
                    g[i] = Math.max(g[i], g[j] + 1);
                }
            }
        }
        int res = 0;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            res = Math.max(res, f[i]);
            sum = Math.max(sum, g[i]);
        }
        return res > sum ? len - res : len - sum;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 3, 2, 1};
        int res = getNum(arr);
        System.out.println(res);
    }

}