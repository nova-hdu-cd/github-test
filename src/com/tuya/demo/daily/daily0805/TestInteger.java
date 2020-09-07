package com.tuya.demo.daily.daily0805;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author chendong
 * @date 2020/6/16 4:52 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class TestInteger {
    public static void main(String[] args) {
        int a = -10;
        for (int i = 0; i < 32; i++) {
            int t = (a & 0x80000000 >>> i) >>> (31 - i);
            System.out.print(t);
        }
        //程序参数 + hello world
        for (String arg : args) {
            System.out.print(arg);
        }
        System.out.println();
        Stream.of(args).filter("hello"::equals).collect(Collectors.toList()).forEach(System.out::print);
        System.out.println();
        //-Xmx32m 设置虚拟机的最大堆内存
        System.out.println("-Xmx" + Runtime.getRuntime().maxMemory() / 1000 / 1000 + "m");
    }

}
