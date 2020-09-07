package com.tuya.demo.daily.singletion;

/**
 * @author chendong
 * @date 2020/7/18 9:52 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class HungrySingletion {

    /**
     * 饿汉式
     */
    private static final HungrySingletion hungrySingletion = new HungrySingletion();

    private HungrySingletion() {
    }

    public static HungrySingletion getHungrySingletion() {
        return hungrySingletion;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(getHungrySingletion())).start();
        }
    }

}
