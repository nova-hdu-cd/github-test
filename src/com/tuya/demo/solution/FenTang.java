package com.tuya.demo.solution;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 分糖
 * 有n个小孩子在一起，每个孩子都有一个评分
 * 按照下面的规则给孩子们分糖果
 * 1。每个小朋友至少要分得一个糖果
 * 2。分数高的小孩要比他旁边分低的小孩分得的糖果多
 *
 * @author chendong
 * @date 2020/9/3 3:05 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class FenTang {

    public int candy(int[] ratings) {

        if (ratings.length == 0 || ratings == null) {
            return 0;
        }
        int[] dp = new int[ratings.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            }
        }

        for (int j = ratings.length - 1; j > 0; j--) {
            if (ratings[j] < ratings[j - 1] && dp[j] >= dp[j - 1]) {
                dp[j - 1] = dp[j] + 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < dp.length; i++) {
            sum += dp[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] s = line.split(" ");
        int[] arr = new int[s.length];

        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        
        FenTang fenTang = new FenTang();
        int res = fenTang.candy(arr);
        System.out.println(res);
    }

}
