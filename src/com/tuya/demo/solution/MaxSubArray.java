package com.tuya.demo.solution;

/**
 * 连续子数组的最大和
 *
 * @author chendong
 * @date 2020/9/14 7:25 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        int sum = 0, ans = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sum = Math.max(sum, nums[i]);
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    public static void main(String[] args) {
        MaxSubArray maxSubArray = new MaxSubArray();
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray.maxSubArray(arr));
    }

}
