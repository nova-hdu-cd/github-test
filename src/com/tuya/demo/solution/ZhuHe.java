package com.tuya.demo.solution;

import java.util.Scanner;

/**
 * 目前市面上的纸币主要有1元，5元，10元，20元，50元、100元六种，如果要买一件商品x元，有多少种货币组成方式？
 *
 * @author chendong
 * @date 2020/9/3 4:00 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class ZhuHe {

    /**
     * @param x 商品金额
     */
    public static int test1(int x) {
        int sum = 0;
        //符合条件的组合次数
        int count = 0;
        //循环次数
        int times = 0;
        //硬币面额
        int[] a = {1, 5, 10, 20, 50, 100};

        for (int i = 0; i <= x / a[5]; i++) {
            //100元可能出现的张数
            for (int j = 0; j <= x / a[4]; j++) {
                //50元可能出现的张数
                for (int k = 0; k <= x / a[3]; k++) {
                    //20元可能出现的张数
                    for (int l = 0; l <= x / a[2]; l++) {
                        //10元可能出现的张数
                        for (int m = 0; m <= x / a[1]; m++) {
                            //5元可能出现的张数
                            int n = x - (i * a[5] + j * a[4] + k * a[3] + l * a[2] + m * a[1]);
                            sum = i * a[5] + j * a[4] + k * a[3] + l * a[2] + m * a[1] + n * a[0];
                            times++;
                            if (sum == x && n >= 0) {
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("循环次数：" + times);
        System.out.println("组合数：" + count);
        return count;
    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        //指定200元的金额
        int count = test1(val);
        long endTime = System.currentTimeMillis();
        System.out.println("执行时间：" + (endTime - startTime) + "ms");
        System.out.println(count);
    }
}
