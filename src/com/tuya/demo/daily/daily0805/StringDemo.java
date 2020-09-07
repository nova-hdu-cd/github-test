package com.tuya.demo.daily.daily0805;

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


        //2147483647为32位int最大值
        String str = "1176213349,537778828,2147483647";
        String[] strs = str.split(",");

        //数组 -> list
        List<String> list = Arrays.asList(strs);

        //数组 -> stream
        Stream.of(strs).map(String::trim).map(o -> "tuya" + o + "\t").map(s -> s.substring(4)).
                collect(Collectors.toList());

        //list -> stream
        list.stream().map(String::trim).map(Integer::valueOf).sorted((o1, o2) -> o1 - o2).filter(o -> o == 1176213349)
                .forEach(System.out::println);

        Stream.of(strs).filter(o -> o.startsWith("11")).forEach(System.out::println);

    }

}
