package com.tuya.demo.tonghuashun;

/**
 * @author chendong
 * @date 2020/9/5 10:19 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Example {

    String str = new String("good");
    char[] ch = {'a', 'b', 'c'};

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'g';
    }

    public static void main(String[] args) {
        Example ex = new Example();
        ex.change(ex.str, ex.ch);
        System.out.println(ex.str + " and ");
        System.out.println(ex.ch);

    }

}
