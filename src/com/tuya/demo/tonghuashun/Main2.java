package com.tuya.demo.tonghuashun;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chendong
 * @date 2020/9/5 11:03 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main2 {

    public static List<Integer> getNotInclude5() {

        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 999; i++) {
            if (i % 5 != 0 && i / 10 != 5 && i / 100 != 5) {
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> notInclude5 = getNotInclude5();
        System.out.println(notInclude5);
    }
}
