package com.tuya.demo.daily0805;

import java.util.Scanner;

/**
 * @author chendong
 * @date 2020/8/20 8:52 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.nextLine();

        getSum(str, word);

    }

    public static void getSum(String s1, String s2) {
        int count = 0;
        for (int i = 0; i + s2.length() - 1 < s1.length(); i++) {
            if (s1.substring(i, i + s2.length()).equals(s2)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
