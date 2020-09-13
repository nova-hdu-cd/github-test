package com.tuya.demo.qianxin;

/**
 * @author chendong
 * @date 2020/9/12 9:36 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main1 {

    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * M包糖果，抛M次硬币，硬币连续n次为正面，最多能得到多少颗糖果
     *
     * @param candies int整型一维数组 每包糖果的数量
     * @param coin    int整型一维数组 抛硬币的结果
     * @param n       int整型 连续是正面的次数
     * @return int整型
     */
    public int maxCandies(int[] candies, int[] coin, int n) {
        // write code here
        int sum = 0;
        int res = 0;

        int item = 0;
        int j = 0;
        int k = 0;
        while (k < candies.length) {
            int i = k;
            while (i < k + n) {
                item += candies[i];
                i++;
            }
            if (item > sum) {
                sum = item;
                System.out.println(sum);
                j = i;
            }
            k = k + 1;
        }
        System.out.println(sum + " " + j);
        int max1 = 0;
        int[] arr = new int[coin.length];
        for (int i = 0; i < coin.length; i++) {
            if (coin[i] == 0 && i != j + 1) {
                max1 += candies[i];
                arr[i] = candies[i];
            }
        }
        System.out.println(max1);

        return sum + max1;

    }

    public static void main(String[] args) {
        Main1 main1 = new Main1();
        int[] c = {3, 5, 7, 2, 8, 8, 15, 3};
        int[] b = {1, 0, 1, 0, 1, 0, 1, 0};
        int res = main1.maxCandies(c, b, 3);
        System.out.println(res);
    }

}
