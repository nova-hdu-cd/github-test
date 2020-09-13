package com.tuya.demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(), zeroNum = 0, fiveNum = 0;
        for (int i = 0; i < num; i++) {
            if (scanner.nextInt() == 0) {
                zeroNum++;
            } else {
                fiveNum++;
            }
        }
        scanner.close();
        if (zeroNum == 0) {
            System.out.println(-1);
        } else if (fiveNum < 9) {
            System.out.println(0);
        } else {
            //a
            String fiveBasicString = "555555555";
            //b
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < fiveNum / 9; i++) {
                result.append(fiveBasicString);
            }
            for (int i = 0; i < zeroNum; i++) {
                result.append(0);
            }
            System.out.println(result);
        }
    }
}
