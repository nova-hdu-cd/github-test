package com.tuya.demo.dailypro;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 前k个高频元素
 *
 * @author chendong
 * @date 2020/9/13 9:17 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class TopK {

    public static int[] topK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            map.put(nums[i], map.get(nums[i]) == null ? 0 : map.get(nums[i]) + 1);
        }
        Queue<int[]> minHeap = new PriorityQueue<>(TopK::compare);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey(), count = entry.getValue();
            if (minHeap.size() == k) {
                int[] peek = minHeap.peek();
                if (peek[1] < count) {
                    minHeap.poll();
                    minHeap.offer(new int[] {num, count});
                }
            } else {
                minHeap.offer(new int[] {num, count});
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; ++i) {
            res[i] = minHeap.poll()[0];
        }
        return res;
    }

    public static int[] topK2(int[] nums, int k) {
        Map<Integer, Integer> map = IntStream.of(nums).boxed().collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
        //map.forEach((k1, v1) -> System.out.println(k1 + "->" + v1));
        //小顶堆
        Queue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(map::get));
        map.forEach((num, count) -> {
            if (queue.size() < k) {
                queue.offer(num);
            } else if (map.get(queue.peek()) < count) {
                queue.poll();
                queue.offer(num);
            }
        });
        int[] ret = new int[k];
        int idx = 0;
        for (int num : queue) {
            ret[idx++] = num;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int[] res = topK(nums, 2);
        System.out.println(Arrays.toString(res));

        int[] res2 = topK2(nums, 2);
        System.out.println(Arrays.toString(res2));
    }

    private static int compare(int[] m, int[] n) {
        return m[1] - n[1];
    }
}
