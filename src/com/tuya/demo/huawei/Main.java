package com.tuya.demo.huawei;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            String[] split = s.split(",");
            int[] arr = new int[split.length];
            int i = 0;
            for (String ss : split) {
                arr[i++] = Integer.parseInt(ss);
            }

            int mid = arr.length / 2;

            int cnt = 0;
            for (int j = 1; j < mid / 2; j++) {
                if (arr[i] == arr[mid - j]) {
                    
                }
            }
        }
    }
}
