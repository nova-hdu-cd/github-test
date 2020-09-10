package com.tuya.demo.zte;

import java.util.Scanner;

/**
 * @author chendong
 * @date 2020/9/7 9:11 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] s0 = sc.nextLine().split(" ");
            int n = Integer.parseInt(s0[0]);

            int l = 0, r = 0;
            for (int i = 0; i < n; i++) {
                String[] split = sc.nextLine().split(" ");
                l = caiquan(split[0], split[2], split[3]);
                r = caiquan(split[1], split[2], split[3]);
            }

            if (l > r) {
                System.out.println("left");
            } else if (l < r) {
                System.out.println("right");
            } else {
                System.out.println("same");
            }

        }
    }

    private static int caiquan(String s1, String s2, String s3) {
        boolean left = (s1.equals("S") && (s2.equals("J") || s3.equals("J")))
                || (s1.equals("J") && (s2.equals("B") || s3.equals("B"))) || (
                s1.equals("B") && (s2.equals("S") || s3.equals("S")));

        boolean right = (s1.equals("S") && (s2.equals("B") || s3.equals("B")))
                || (s1.equals("J") && (s2.equals("S") || s3.equals("S"))) ||
                (s1.equals("B") && (s2.equals("J") || s3.equals("J")));

        if (left) {
            return 1;
        }
        if (right) {
            return -1;
        }
        return 0;
    }

}
