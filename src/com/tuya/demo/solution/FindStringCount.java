package com.tuya.demo.solution;

import java.util.Scanner;

/**
 * 在一个字符串里，查找另一个字符串的个数？
 *
 * @author chendong
 * @date 2020/8/20 8:52 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class FindStringCount {
    /**
     * 在s1里查找s2的个数
     *
     * @param s1 源字符串
     * @param s2 目标字符串
     * @return 个数
     */
    public static int getSum(String s1, String s2) {
        int count = 0;
        for (int i = 0; i + s2.length() - 1 < s1.length(); i++) {
            if (s1.substring(i, i + s2.length()).equals(s2)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.nextLine();
        int sum = getSum(str, word);
        System.out.println(sum);

    }
}
