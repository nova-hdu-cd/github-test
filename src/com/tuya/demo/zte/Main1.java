package com.tuya.demo.zte;

import java.util.Scanner;

/**
 * @author chendong
 * @date 2020/9/7 9:11 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] s0 = sc.nextLine().split(" ");
            int n = Integer.parseInt(s0[0]);
            int m = Integer.parseInt(s0[1]);
            int ans = 0;
            boolean[] flag = new boolean[n];
            double tmp = 0;
            for (int i = 0; i < m; i++) {
                double arg = 0;
                double[] arr = new double[n];
                for (int j = 0; j < n; j++) {
                    tmp = sc.nextInt();
                    arg += tmp;
                    arr[j] = tmp;
                }
                arg = arg / n;
                for (int j = 0; j < n; j++) {
                    if (arr[j] > arg && !flag[j]) {
                        ++ans;
                        flag[j] = true;
                    }
                }
            }
            System.out.println(ans);
        }
    }

}
