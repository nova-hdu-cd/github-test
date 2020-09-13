package com.tuya.demo.youzan;

/**
 * 相加项之和
 * 2,4
 * 2+22+222+22
 *
 * @author chendong
 * @date 2020/9/11 2:35 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main {
    public static long sum(int num, int itemNum) {
        // write code here
        long res = 0;
        int n = num;
        for (int i = 0; i < itemNum; i++, num *= 10 + n) {
            res += num;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
    }
}
