package com.tuya.demo.daily.singletion;

/**
 * 单例的内部类
 *
 * @author chendong
 * @date 2020/8/13 4:57 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class StaticInnerClassSingletion {

    private StaticInnerClassSingletion() {
    }

    public static StaticInnerClassSingletion get() {
        return InnerClassHolder.INSTANCE;
    }

    /**
     * 静态内部类
     **/
    private static class InnerClassHolder {
        private static StaticInnerClassSingletion INSTANCE = new StaticInnerClassSingletion();
    }

    public static void run() {
        StaticInnerClassSingletion singletion = StaticInnerClassSingletion.get();
        System.out.println(singletion);
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(StaticInnerClassSingletion::run).start();
        }
    }
}
