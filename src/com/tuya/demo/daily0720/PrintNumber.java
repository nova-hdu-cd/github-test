package com.tuya.demo.daily0720;

/**
 * @author chendong
 * @date 2020/7/20 8:41 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class PrintNumber implements Runnable {

    int num = 1;

    @Override
    public void run() {

        synchronized (this) {
            while (true) {
                notifyAll();
                if (num <= 100) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "-" + num);
                    num++;
                } else {
                    break;
                }
                try {
                    wait();
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) {

        PrintNumber p = new PrintNumber();

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();
    }
}
