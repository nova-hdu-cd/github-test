package com.tuya.demo;

/**
 * 用wait和notify实现线程的有序执行
 *
 * @author chendong
 * @date 2020/9/2 8:13 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class SyncThreadDemo {

    public static boolean flag = false;

    public static int num = 0;

    public static class Man {
        public synchronized void getRun1() throws InterruptedException {
            while (flag) {
                wait();
            }
            System.out.println("生产出" + (++num) + "个");
            flag = true;
            notify();
        }

        public synchronized void getRun2() throws InterruptedException {
            while (!flag) {
                wait();
            }
            Thread.sleep(1000);
            System.out.println("取出" + (num--) + "个");
            flag = false;
            notify();
        }
    }

    public static void main(String[] args) {
        Man man = new Man();
        new Thread(() -> {
            try {
                man.getRun1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                man.getRun2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}
