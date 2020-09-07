package com.tuya.demo.meituan;

import java.util.Scanner;

/**
 * @author chendong
 * @date 2020/9/6 9:42 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line1 = sc.nextLine().split(" ");
        String[] line2 = sc.nextLine().split(" ");
        String[] line3 = sc.nextLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int p = Integer.parseInt(line1[1]);
        int q = Integer.parseInt(line1[2]);

        int[] arr1 = new int[p];
        int[] arr2 = new int[q];
        for (int i = 0; i < p; i++) {
            arr1[i] = Integer.parseInt(line2[i]);
        }
        for (int i = 0; i < q; i++) {
            arr2[i] = Integer.parseInt(line3[i]);
        }

        int cntA, cntB, cntC = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    cntC++;
                }
            }
        }
        cntA = arr1.length - cntC;
        cntB = arr2.length - cntC;

        System.out.println(cntA + " " + cntB + " " + cntC);

    }

}
