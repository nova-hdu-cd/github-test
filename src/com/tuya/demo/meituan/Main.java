package com.tuya.demo.meituan;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.nextLine();
            String[] s1 = sc.nextLine().split(" ");
            String[] s3 = sc.nextLine().split(" ");
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < s1.length; i++) {
                set.add(Integer.valueOf(s1[i]));
            }
            int count = 0;
            for (int i = 0; i < s3.length; i++) {
                if (set.contains(Integer.valueOf(s3[i]))) {
                    count++;
                    set.remove(Integer.valueOf(s3[i]));
                }

            }
            int cnt = s3.length - count;
            int size = set.size();
            System.out.println(size + " " + cnt + " " + count);
        }
    }
}

