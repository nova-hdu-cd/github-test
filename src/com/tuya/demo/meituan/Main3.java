package com.tuya.demo.meituan;

import java.util.Scanner;

/**
 * @author chendong
 * @date 2020/9/6 9:43 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);

        String[] line1 = sc.nextLine().split(" ");
        int[] arr = new int[line1.length];
        for (int i = 0; i < line1.length; i++) {
            arr[i] = Integer.parseInt(line1[i]);
        }
        int[] c = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            c[i] = operate(i, n, arr[i]);
        }

        int res = 0;
        for (int i = 0; i < c.length; i++) {
            res ^= c[i];
        }
        System.out.println(res);

    }

    private static int operate(int i, int n, int ai) {
        for (int j = 1; j <= n; j++) {
            ai ^= (i % j);
        }
        return ai;
    }
}
