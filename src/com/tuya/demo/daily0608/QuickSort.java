package com.tuya.demo.daily0608;

import java.util.Arrays;

/**
 * @author chendong
 * @date 2020/6/8 9:32 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class QuickSort {

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int[] m = partition(arr, l, r);
            sort(arr, l, m[0]);
            sort(arr, m[1], r);
        }
    }

    public static int[] partition(int[] arr, int l, int r) {
        int p1 = l - 1;
        int p2 = r + 1;
        int cur = l;
        int target = arr[r];
        while (cur < p2) {
            if (arr[cur] < target) {
                swap(arr, ++p1, cur++);
            } else if (arr[cur] > target) {
                swap(arr, --p2, cur);
            } else {
                cur++;
            }
        }
        return new int[] {p1, p2};
    }

    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
