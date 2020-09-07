package com.tuya.demo.bilibili.util;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author chendong
 * @date 2020/9/2 4:31 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class IODemo {

    /**
     * 1 2 -> n=1 m=2
     */
    public static void input0() {
        Scanner sc = new Scanner(System.in);
        String[] split0 = sc.nextLine().split(" ");
        int n = Integer.parseInt(split0[0]);
        int m = Integer.parseInt(split0[1]);
        System.out.println(n + " " + m);
    }

    /**
     * 1 2 3 4 5 -> [1, 2, 3, 4, 5]
     */
    public static void input1() {
        Scanner sc = new Scanner(System.in);
        String[] split1 = sc.nextLine().split(" ");
        int[] arr = new int[split1.length];
        for (int i = 0; i < split1.length; i++) {
            arr[i] = Integer.parseInt(split1[i]);
        }
        System.out.println(Arrays.toString(arr));

    }

    /**
     * 2 2
     * 1 3   ->  1 3
     * 2 4       2 4
     */
    public static void input2() {
        Scanner sc = new Scanner(System.in);
        String[] split0 = sc.nextLine().split(" ");
        int n, m = 0;
        if (split0.length == 1) {
            n = m = Integer.parseInt(split0[0]);
        } else {
            n = Integer.parseInt(split0[0]);
            m = Integer.parseInt(split0[1]);
        }
        int[][] martix = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] s = sc.nextLine().split(" ");
            for (int j = 0; j < m; j++) {
                martix[i][j] = Integer.parseInt(s[j]);
            }
        }
        printmartix(martix);
    }

    private static void printmartix(int[][] martix) {
        for (int i = 0; i < martix.length; i++) {
            for (int j = 0; j < martix[i].length; j++) {
                System.out.print(martix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //input0();
        //input1();
        input2();
    }

}
