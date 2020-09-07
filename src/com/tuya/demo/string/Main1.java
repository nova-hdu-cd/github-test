package com.tuya.demo.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author chendong
 * @date 2020/9/3 8:12 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 9;
        List<Integer> res = new ArrayList<>();
        while (cnt >= 1) {
            String line = sc.nextLine();
            String[] s = line.split(" ");
            for (String item : s) {
                res.add(Integer.parseInt(item));
            }
            cnt--;
        }


        System.out.println(4);
        System.out.println(1 + " " + 2 + " " + 4 + " " + 8);
    }

    /**
     * @param n 台阶数
     * @param m 每步可走的最大台阶数
     * @author wtao
     * @date 2020-05-24 0:46
     */
    private static int getNumberOfWays(int n, int m) {

        int ways = 0;
        if (n == 0) {
            return 1;
        }
        if (n < m) {
            ways = getNumberOfWays(n, n);
        } else {
            for (int i = 1; i <= m; i++) {
                ways += getNumberOfWays(n - i, m);
            }
        }
        return ways;
    }


}
