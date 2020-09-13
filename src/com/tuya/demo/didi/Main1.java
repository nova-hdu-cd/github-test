package com.tuya.demo.didi;

import java.util.Scanner;

/**
 * @author chendong
 * @date 2020/9/13 6:04 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = Integer.parseInt(scanner.nextLine());
            String line = scanner.nextLine();
            char[] c = line.toCharArray();
            StringBuilder sb = new StringBuilder();
            String ss = "";
            for (int i = 0; i < c.length; i = i + n) {
                if (i + n > c.length) {
                    ss = line.substring(i, c.length);
                    break;
                }
                String s = line.substring(i, i + n);
                StringBuilder s1 = new StringBuilder(s);
                s1.reverse();
                sb.append(s1);
            }
            StringBuilder s2 = new StringBuilder(ss);
            s2.reverse();
            sb.append(s2);
            System.out.println(sb.toString());
        }
    }
}
