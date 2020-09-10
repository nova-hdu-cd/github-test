package com.tuya.demo.guanglianda;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class Question2 {
    public static Queue<Integer> priorityQueue = new PriorityQueue<>();
    public static Vector<Integer> vector = new Vector<>();

    public static boolean judge() {
        if (priorityQueue.size() < 2) {
            return false;
        }
        int res = 0;
        int f = priorityQueue.poll();
        int s = priorityQueue.peek();
        priorityQueue.add(f);
        return f == s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n个数
        int n = sc.nextInt();
        int temp, uio, io;
        for (int i = 0; i < n; i++) {
            priorityQueue.add(sc.nextInt());
        }
        int f1, s2, s3;
        while (!priorityQueue.isEmpty()) {
            if (judge()) {
                int dd = priorityQueue.poll() * 2;
                s2 = priorityQueue.poll();
                priorityQueue.add(dd);
            } else {
                vector.add(priorityQueue.poll());
            }
        }
        for (int i = 1; i < vector.size(); i++) {
            System.out.print(" " + vector.get(i));
        }
        System.out.print(vector.get(0));
    }
}