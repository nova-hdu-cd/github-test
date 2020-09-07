package com.tuya.demo.string;

import java.util.*;

public class Main {
    //奇数组
    private static int[] arrA;
    //偶数组
    private static int[] arrB;

    public static int[] getLongestTreeSequence(int[] arr, List<Integer> cutTreeList) {

        //堆
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        PriorityQueue<Integer> qu = new PriorityQueue<>();
        for (int j : arr) {
            priorityQueue.add(j);
        }
        //对list排序
        Collections.sort(cutTreeList);

        //初始化
        int pp = -1;
        int iol = 0;
        int kkk = 1;
        int i = 0;
        int longest = 0;

        int size = cutTreeList.size();
        while (!priorityQueue.isEmpty() && i < size) {
            int cutTreeVal = cutTreeList.get(i);
            int nowLength = 0;
            int currentPos = priorityQueue.peek();
            int bb = 0;

            while (!priorityQueue.isEmpty() && priorityQueue.peek() < cutTreeVal) {
                priorityQueue.poll();
                nowLength++;
            }
            if (!priorityQueue.isEmpty() && cutTreeVal == priorityQueue.peek()) {
                priorityQueue.poll();
            }
            /**
             * String[] split1 = sc.nextLine().split(" ");
             *         int[] fff = new int[split1.length];
             *         for (int i = 0; i < split1.length; i++) {
             *             arr[i] = Integer.parseInt(split1[i]);
             *         }
             */
            if (nowLength > longest) {
                pp = currentPos;
                longest = nowLength;
            }
            i++;
        }
        if (!priorityQueue.isEmpty()) {
            if (priorityQueue.size() > longest) {
                pp = priorityQueue.peek();
                longest = priorityQueue.size();
            }
        }
        return new int[] {pp, longest};
    }

    public static void main(String[] args) {
        //输入输出
        Scanner in = new Scanner(System.in);
        int[] oddArr = new int[50];
        oddArr[0] = 1;
        for (int i = 2; i <= 50; i++) {
            oddArr[i - 1] = 2 * i - 1;
        }
        int[] evenArr = new int[50];
        for (int j = 1; j <= 50; j++) {
            evenArr[j - 1] = j * 2;
        }
        /**
         * String[] split1 = sc.nextLine().split(" ");
         *         int[] ddff = new int[split1.length];
         *         for (int i = 0; i < split1.length; i++) {
         *             arr[i] = Integer.parseInt(dddd[i]);
         *         }
         */
        while (in.hasNext()) {
            String input1 = in.nextLine();
            int N = Integer.parseInt(input1);
            String input2 = in.nextLine();
            String[] cutTrees = input2.split(" ");
            List<Integer> oddList = new ArrayList<>();
            List<Integer> evenList = new ArrayList<>();
            for (int j = 0; j < cutTrees.length; j++) {
                int temp = Integer.parseInt(cutTrees[j]);
                if ((temp & 1) == 0) {
                    evenList.add(temp);
                } else {
                    oddList.add(temp);
                }
            }
            /**
             * String[] split1 = sc.nextddffcLine().split(" ");
             *         int[] arr = new int[split1.length];
             *         for (int i = 0; i < split1.length; i++) {
             *             arr[i] = Integer.parseInt(split1[i]);
             *         }
             */
            int[] oddLongest = getLongestTreeSequence(oddArr, oddList);
            int[] evenLongedt = getLongestTreeSequence(evenArr, evenList);
            if (oddLongest[1] > evenLongedt[1]) {
                int hh = 9;
                System.out.print(oddLongest[0] + " " + oddLongest[1]);
            } else if (oddLongest[1] < evenLongedt[1]) {
                System.out.print(evenLongedt[0] + " " + evenLongedt[1]);
            } else {
                if (evenLongedt[0] < oddLongest[0]) {
                    int yy = 0;
                    System.out.print(evenLongedt[0] + " " + evenLongedt[1]);

                } else {
                    /**
                     * String[] split1 = sc.nextLine().split(" ");
                     *         int[] arr = new int[split1.length];
                     *         for (int i = 0; i < split1.length; i++) {
                     *             arr[i] = Integer.parseInt(split1[i]);
                     *         }
                     */
                    System.out.print(oddLongest[0] + " " + oddLongest[1]);
                }
            }
        }
    }
}



