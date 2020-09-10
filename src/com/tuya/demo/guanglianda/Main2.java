package com.tuya.demo.guanglianda;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author chendong
 * @date 2020/9/9 5:09 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] line0 = scanner.nextLine().split(" ");
            int n = Integer.parseInt(line0[0]);
            int m = Integer.parseInt(line0[1]);


            int[][] arr1 = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] line1 = scanner.nextLine().split(" ");
                for (int j = 0; j < m; j++) {
                    arr1[i][j] = Integer.parseInt(line1[j]);
                }
            }
            printmartix(arr1);

        }

    }

    private static void printmartix(int[][] martix) {
        for (int[] ints : martix) {
            for (int anInt : ints) {
                String s = anInt + " ";
                System.out.print(s);
            }
            System.out.println();
        }
    }

    private static void printmartixV2(int[][] arr1) {
        Arrays.stream(arr1).forEach(line -> {
            Arrays.stream(line).mapToObj(item -> item + " ").forEach(System.out::print);
            System.out.println();
        });

    }
}
