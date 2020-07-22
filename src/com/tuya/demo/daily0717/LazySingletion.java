package com.tuya.demo.daily0717;

/**
 * DCL懒汉式
 *
 * @author chendong
 * @date 2020/7/18 10:05 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class LazySingletion {

    /**
     * 懒汉式
     */
    private static volatile LazySingletion lazySingletion = null;

    private LazySingletion() {
    }

    /**
     * DCL (Double Check Lock)
     */
    public static LazySingletion getLazySingletion() {
        if (lazySingletion == null) {
            synchronized (LazySingletion.class) {
                if (lazySingletion == null) {
                    lazySingletion = new LazySingletion();
                }
            }
        }
        return lazySingletion;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(getLazySingletion())).start();
        }
    }

}
