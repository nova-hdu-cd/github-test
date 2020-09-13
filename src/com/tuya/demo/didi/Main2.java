package com.tuya.demo.didi;

import java.util.Scanner;

//用并查集
public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dataCount = scanner.nextInt();
        for (int i = 0; i < dataCount; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            UnionFind unionFind = new UnionFind(n);
            for (int j = 0; j < m; j++) {
                int p = scanner.nextInt();
                int q = scanner.nextInt();
                int cost = scanner.nextInt();
                if (cost <= k) {
                    unionFind.union(p, q);
                }
            }
            if (unionFind.count() == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

class UnionFind {

    private int[] record;
    private int count;//岛屿数目

    public UnionFind(int n) {
        record = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            record[i] = i;
        }
        count = n;
    }

    public int find(int p) {
        if (p != record[p]) {
            record[p] = find(record[p]);
        }
        return record[p];
    }

    //造桥
    public void union(int p, int q) {
        int pid = find(p);
        int qid = find(q);
        if (pid == qid) {
            return;
        }
        record[pid] = qid;
        count--;//联通的岛屿算成一个
    }

    public int count() {
        return count;
    }
}