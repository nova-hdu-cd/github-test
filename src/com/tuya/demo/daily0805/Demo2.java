package com.tuya.demo.daily0805;

/**
 * @author chendong
 * @date 2020/8/10 11:02 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Demo2 {

    public static void main(String[] args) {
        String str = "hello-world-china";
        String replace = str.replace("-", ".");
        System.out.println(replace);

        //用于创建格式化的字符串用来连接多个字符串对象
        String formatStr = String.format("hi %s %c %b %d %x %o", str, 'c', 4 < 9, 100, 100, 100);
        System.out.println(formatStr);
    }
}
