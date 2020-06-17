package com.tuya.demo.daily0617;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author chendong
 * @date 2020/6/17 10:42 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = " 123 , 456 , 789 ";
        String[] strs = str.split(",");
        System.out.println(Arrays.toString(strs));
        List<String> strList = Stream.of(strs).map(String::trim).collect(Collectors.toList());
        System.out.println(strList);
    }
}
