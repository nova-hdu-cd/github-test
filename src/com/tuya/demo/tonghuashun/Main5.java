package com.tuya.demo.tonghuashun;

public class Main5 {
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 8, 6, 1, 0, 0, 86};
        range(nums);
        show(nums);
    }

    private static void show(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    private static void range(int[] arr) {
        int i = 0;
        int temp = 0;
        while (i + 1 < arr.length) {
            while (arr[i] != 0 && (i + 1 < arr.length)) {
                i++;
            }
            int flag = i;
            /*如果数组元素为0*/
            while (arr[i] == 0 && ((i + 1) < arr.length)) {
                /*继续向前，直到找到非0数,与之交换*/
                while (arr[i] == 0 && (i + 1) < arr.length) {
                    /*前进*/
                    i++;
                }
                /*如果已经超出界限*/
                if (i >= arr.length) {
                    return;
                }
                /*走到这一步说明已经找到非0数arr[i]*/
                /*交换arr[flag]=0与现在arr[i]=Not0*/
                temp = arr[flag];
                arr[flag] = arr[i];
                arr[i] = temp;

                i = flag + 1;
                flag++;
            }

        }
    }

}