package com.tuya.demo.sort;

import java.util.Arrays;

/**
 * @author chendong
 * @date 2020/8/25 10:10 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Merge {

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }
        int m = l + (r - l) / 2;
        sort(arr, l, m);
        sort(arr, m + 1, r);
        merge(arr, l, m, r);
    }

    public static void merge(int[] arr, int l, int m, int r) {

        //copy to array
        int[] copyArray = new int[r - l + 1];

        int p1 = l;
        int p2 = m + 1;
        int i = 0;
        while (p1 <= m && p2 <= r) {
            copyArray[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= m) {
            copyArray[i++] = arr[p1++];
        }
        while (p2 <= r) {
            copyArray[i++] = arr[p2++];
        }

        //copy return arr
        for (int item : copyArray) {
            arr[l++] = item;
        }

    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
