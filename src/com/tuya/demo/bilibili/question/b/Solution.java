package com.tuya.demo.bilibili.question.b;

import java.util.ArrayList;
import java.util.List;

/**
 * 螺旋矩阵
 */
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param matrix int整型二维数组
     * @return int整型一维数组
     */
    public int[] SpiralMatrix(int[][] matrix) {
        // write code here
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0) {
            return null;
        }
        int m = matrix.length, n = matrix[0].length;
        int u = 0, d = m - 1, l = 0, r = n - 1;
        while (true) {
            //左到右
            for (int j = l; j <= r; j++) {
                res.add(matrix[u][j]);
            }
            if (++u > d) {
                break;
            }
            //上到下
            for (int i = u; i <= d; i++) {
                res.add(matrix[i][r]);
            }
            if (l > --r) {
                break;
            }
            //右到左
            for (int j = r; j >= l; j--) {
                res.add(matrix[d][j]);
                if (u > --d) {
                    break;
                }
                //下到上
                for (int i = d; i >= u; i--) {
                    res.add(matrix[i][l]);
                }
                if (++l > r) {
                    break;
                }
            }
        }
        int[] re = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            re[i] = res.get(i);
        }
        return re;
    }
}
