package com.tuya.demo.sort;

/**
 * @author chendong
 * @date 2020/9/3 5:59 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /**
         * String[] split1 = sc.nextLine().split(" ");
         *         int[] arr = new int[split1.length];
         *         for (int i = 0; i < split1.length; i++) {
         *             arr[i] = Integer.parseInt(split1[i]);
         *         }
         */
        int num = 1, max = 1;
        int tree = in.nextInt();
        if (tree <= 100000) {
            int[] c = new int[tree];
            int[] cc = new int[tree];
            for (int i = 0; i < tree; i++) {
                c[i] = in.nextInt();
            }
            if (tree < c.length) {
                System.out.println(0);
            }
            for (int i = 0; i < tree; i++) {
                cc[i] = c[i];
                for (int j = i + 1; j < tree; j++) {
                    cc[j] = c[j];
                    if (cc[i] + 1 == cc[j]) {
                        num += 1;
                        cc[i] = cc[j];
                    }
                }
                if (num > max) {
                    max = num;
                }
                num = 1;
            }
            System.out.println(tree - max);
        }
    }
}


