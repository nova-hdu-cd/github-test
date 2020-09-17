package com.tuya.demo.solution;

import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 数组中的k个高频元素
 *
 * @author chendong
 * @date 2020/9/14 8:51 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class TopK {

    public int[] topK(int[] nums, int k) {

        //统计词频
        Map<Integer, Integer> counter = IntStream.of(nums).boxed().collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));

        Queue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(counter::get));
        counter.forEach(
                (num, cnt) -> {
                    if (queue.size() < k) {
                        queue.offer(num);
                    } else if (counter.get(queue.peek()) < cnt) {
                        queue.poll();
                        queue.offer(num);
                    }
                }
        );

        int[] arr = new int[k];
        int idx = 0;
        for (int num : queue) {
            arr[idx++] = num;
        }

        return arr;

    }

    public static void main(String[] args) {

    }

}
