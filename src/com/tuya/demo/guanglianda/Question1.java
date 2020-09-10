package com.tuya.demo.guanglianda;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, m, x, l, p;
        n = sc.nextInt();
        m = sc.nextInt();
        x = sc.nextInt();
        int temp, res, ls;
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            queue.add(queue.poll() + x);
        }
        System.out.println(queue.poll());
    }
}