package com.tuya.demo.tencent;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author chendong
 * @date 2020/9/6 7:48 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = Integer.parseInt(sc.nextLine());
            String[] s = sc.nextLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            for (int i = 0; i < n; i++) {

                System.out.println(medianII(arr));

            }

        }

    }

    public static Integer medianII(int[] nums) {
        // write your code here
        if (nums == null) {
            return null;
        }
        int[] res = new int[nums.length];

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(1, new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                return y - x;
            }
        });

        res[0] = nums[0];
        maxHeap.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            int x = maxHeap.peek();
            if (nums[i] <= x) {
                maxHeap.add(nums[i]);
            } else {
                minHeap.add(nums[i]);
            }
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.add(maxHeap.poll());
            } else if (maxHeap.size() < minHeap.size()) {
                maxHeap.add(minHeap.poll());
            }
            res[i] = maxHeap.peek();
        }
        return res[res.length];
    }
}
