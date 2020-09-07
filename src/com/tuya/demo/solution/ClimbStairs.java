package com.tuya.demo.solution;

import java.util.Scanner;

/**
 * 青蛙跳台阶
 * <p>
 * 一只青蛙要跳上n层高的台阶，一次能跳一级，也可以跳两级，请问这只青蛙有多少种跳上这个n层高台阶的方法？
 *
 * @author chendong
 * @date 2020/9/3 3:23 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class ClimbStairs {

    public int climb0(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return climb0(n - 1) + climb0(n - 2);
    }

    public int climb1(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        long[] dp = new long[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return (int) dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        ClimbStairs climbStairs = new ClimbStairs();
        int climb0 = climbStairs.climb0(val);
        int climb1 = climbStairs.climb1(val);
        System.out.println(climb0);
        System.out.println(climb1);

    }

}
