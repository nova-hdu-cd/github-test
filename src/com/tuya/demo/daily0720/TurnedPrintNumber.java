package com.tuya.demo.daily0720;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author chendong
 * @date 2020/7/20 8:08 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class TurnedPrintNumber {

    private int max;
    private AtomicInteger status = new AtomicInteger(1);

    public TurnedPrintNumber(int max) {
        this.max = max;
    }

    public static void main(String[] args) {
        TurnedPrintNumber turnedPrintNumber = new TurnedPrintNumber(100);
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);
        fixedThreadPool.submit(turnedPrintNumber.new Printer("p1", 1));
        fixedThreadPool.submit(turnedPrintNumber.new Printer("p2", 0));
        fixedThreadPool.shutdown();
    }

    class Printer implements Runnable {

        private String name;
        private int type;

        public Printer(String name, int type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public void run() {
            if (type == 1) {
                while (status.get() <= max) {
                    synchronized (TurnedPrintNumber.class) {
                        if (status.get() <= max && status.get() % 2 == 0) {
                            System.out.println(name + "-" + status.getAndIncrement());
                        }
                    }
                }
            } else {
                while (status.get() <= max) {
                    synchronized (TurnedPrintNumber.class) {
                        if (status.get() <= max && status.get() % 2 != 0) {
                            System.out.println(name + "-" + status.getAndIncrement());
                        }
                    }
                }
            }
        }
    }

}
