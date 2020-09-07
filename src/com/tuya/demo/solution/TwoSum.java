package com.tuya.demo.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 两数之和
 *
 * @author chendong
 * @date 2020/9/3 4:45 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        int idx1 = 0;
        int idx2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                idx1 = i;
                idx2 = map.get(target - nums[i]);
                return new int[] {idx2, idx1};
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strs = scanner.nextLine().split(" ");
        int[] nums = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        int target = scanner.nextInt();

        TwoSum twoSum = new TwoSum();
        int[] res = twoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }
}
