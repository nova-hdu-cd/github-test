package com.tuya.demo.guanglianda;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.out;

public class Question222 {
    public static void setAdd(Set<Integer> set, Integer i) {
        if (!set.add(i)) {
            set.remove(i);
            setAdd(set, i / 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] array = new Integer[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        LinkedHashSet<Integer> res = new LinkedHashSet<>();
        for (int i = 0; i < array.length; i++) {
            setAdd(res, array[i]);
        }
        Iterator<Integer> iterator = res.iterator();
        while (iterator.hasNext()) {
            out.print(iterator.next());
            if (iterator.hasNext()) {
                out.print(" ");
            }
        }
    }
}