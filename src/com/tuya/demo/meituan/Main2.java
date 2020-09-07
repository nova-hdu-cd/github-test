package com.tuya.demo.meituan;

import java.util.Scanner;

/**
 * @author chendong
 * @date 2020/9/6 9:42 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        int cnt = 0;
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            if (Character.isUpperCase(arr[i])) {
                cnt++;
            }
        }
        int l = len - cnt;

        System.out.println(Math.abs(cnt - l) / 2);
    }


}
