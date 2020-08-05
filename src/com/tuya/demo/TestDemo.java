package com.tuya.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestDemo {

    private static List<String> arrayList = new ArrayList<>();

    static {
        arrayList.addAll(Arrays.asList("hello", "world", "we", "are", "family"));
    }

    public static void learnArrayList() {

        /*
         * ArrayList.subList()返回的是一个ArrayList的内部类subList，不能强转为ArrayList。
         */
        List<String> list = arrayList.subList(0, 2);
        System.out.println(list);

        /*
         * 集合转数组，必须使用toArray()方法，传入类型完全一样大小的数组
         */
        String[] size = new String[list.size()];
        String[] array = list.toArray(size);
        System.out.println(Arrays.toString(array));

        /*
         *使用工具类 Arrays.asList()把数组转换成集合时，不能使用其修改集合相关的方法，
         *它的add/remove/clear 方法会抛出 UnsupportedOperationException 异常
         */
        List<String> strings = Arrays.asList("hello", "world");
        //strings.add("you");
        System.out.println(strings);

        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String cur = iterator.next();
            if ("hello".equals(cur)) {
                iterator.remove();
            }
        }
        System.out.println(arrayList);

    }

    public static void main(String[] args) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        res.add(1);
        res.add(1);
        res.add(1);
        System.out.println(res.subList(0, 2));

    }

}
