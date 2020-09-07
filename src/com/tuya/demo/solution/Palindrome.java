package com.tuya.demo.solution;

import java.util.Scanner;

/**
 * 回文数
 * <p>
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * @author chendong
 * @date 2020/9/3 3:50 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        String s = String.valueOf(x);
        for (int i = 1; i < s.length(); i++) {
            //只判断到了字符串末尾，去判断整个字符串是否是回文
            if (isValid(s, 0, i) && i == s.length() - 1) {
                return true;
            }
        }
        return false;
    }

    private boolean isValid(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int item = scanner.nextInt();
        Palindrome palindrome = new Palindrome();
        boolean b = palindrome.isPalindrome(item);
        System.out.println(b);
    }

}
