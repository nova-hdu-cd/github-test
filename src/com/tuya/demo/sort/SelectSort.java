package com.tuya.demo.sort;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author chendong
 * @date 2020/9/15 10:13 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class SelectSort {

    public void selectSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < nums.length; j++) {
                minIdx = nums[j] < nums[minIdx] ? j : minIdx;
                swap(nums, i, minIdx);
            }
        }
    }

    public void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        SelectSort selectSort = new SelectSort();
        selectSort.selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
