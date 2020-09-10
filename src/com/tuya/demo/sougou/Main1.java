package com.tuya.demo.sougou;

import java.util.Arrays;

/**
 * @author chendong
 * @date 2020/9/5 6:35 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main1 {

    public int get(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        int min = arr[0];

        int sum = a + b + c;

        int mid = sum / 3;
        int cnt = sum - 3 * mid;

        if (cnt < 0) {
            
        }

        int item = cnt / 2;

        return item / 3 + mid;
    }

    public static void main(String[] args) {
        Main1 main1 = new Main1();
        System.out.println(main1.get(9, 3, 3));
    }

}
