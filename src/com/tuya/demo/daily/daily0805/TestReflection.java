package com.tuya.demo.daily.daily0805;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author chendong
 * @date 2020/8/24 9:32 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class TestReflection {

    public static void sort(int[] arr, int l, int r) {
        if (l == r) {
            return;
        }
        int m = (r - l) / 2 + l;
        sort(arr, l, m);
        sort(arr, m + 1, r);
        merge(arr, l, m, r);
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        //额外的数组
        int[] copy = new int[r - l + 1];

        //左边索引和右边索引
        int p1 = l;
        int p2 = mid + 1;

        int i = 0;
        //1.按顺序较小的元素copy到额外的数组
        while (p1 <= mid && p2 <= r) {
            //copy[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
            if (arr[p1] < arr[p2]) {
                copy[i++] = arr[p1++];
            } else {
                copy[i++] = arr[p2++];
            }
        }

        //2,左边的数组没有copy完
        while (p1 <= mid) {
            copy[i++] = arr[p1++];
        }

        //3.右边的数组没有copy完
        while (p2 <= r) {
            copy[i++] = arr[p2++];
        }

        for (int item : copy) {
            arr[l++] = item;
        }
    }

    public static Map<Integer, Integer> getMap(String name)
            throws Exception {
        Class<Map<Integer, Integer>> clazz = (Class<Map<Integer, Integer>>) Class.forName(name);
        Constructor<Map<Integer, Integer>> constructor = clazz.getConstructor();
        return constructor.newInstance();
    }

    public static void getAllFields(String name) throws Exception {
        Class<?> clazz = Class.forName(name);
        Field[] fields1 = clazz.getFields();
        Field[] fields2 = clazz.getDeclaredFields();

        for (Field field : fields1) {
            field.setAccessible(true);
        }

        for (Field field : fields2) {
            field.setAccessible(true);
        }

        Set<Field> all = new HashSet<>();
        all.addAll(Arrays.asList(fields1));
        all.addAll(Arrays.asList(fields2));

        System.out.println(all.toString());
    }

    public static void main(String[] args)
            throws Exception {
        Map<Integer, Integer> map = getMap("java.util.HashMap");
        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.forEach((k, v) -> {
            System.out.println(k + ":" + v + "\t");
        });

        getAllFields("com.tuya.demo.daily.daily0805.Son");

        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));


    }

}
