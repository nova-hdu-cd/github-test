package com.tuya.demo.zhiguang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static int ch[] = {1, 2, 3, 5, 6, 7, 9, 12, 16};

    static int[] insertNum(int number) {
        return null;
    }

    public static List<Integer> merge(List<Integer> l1, List<Integer> l2) {

        List<Integer> res = new ArrayList<>(l1.size() + l2.size());
        int p1 = 0;
        int p2 = 0;

        while (p1 < l1.size() && p2 < l2.size()) {
            if (l1.get(p1) <= l2.get(p2)) {
                res.add(l1.get(p1));
                p1++;
            } else {
                res.add(l2.get(p2));
                p2++;
            }
        }

        while (p1 < l1.size()) {
            for (int i = p1; i < l1.size(); i++) {
                res.add(l1.get(i));
                p1++;
            }
        }

        while (p2 < l2.size()) {
            for (int i = p2; i < l2.size(); i++) {
                res.add(l2.get(i));
                p2++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> merge = merge(l1, l2);
        System.out.println(merge);

    }
}
