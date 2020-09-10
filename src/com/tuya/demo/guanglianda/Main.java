package com.tuya.demo.guanglianda;

import java.util.Scanner;

/**
 * @author chendong
 * @date 2020/9/9 5:09 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = Integer.parseInt(scanner.nextLine());

            String[] line1 = scanner.nextLine().split(" ");
            int[] arr1 = new int[line1.length];
            for (int i = 0; i < line1.length; i++) {
                arr1[i] = Integer.parseInt(line1[i]);
            }
        }

    }
}
