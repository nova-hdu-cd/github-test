package com.tuya.demo.netease1;

import java.util.Scanner;

/**
 * @author chendong
 * @date 2020/9/12 3:03 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            int res = longestPalindrome(line);
            System.out.println(res);
        }
    }

    public static int longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return 0;
        }
        int cnt = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (isValid(s, i, j)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private static boolean isValid(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
