package com.tuya.demo.daily0720;

import java.util.concurrent.CountDownLatch;

/**
 * @author chendong
 * @date 2020/7/20 7:32 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class MoveData {

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(2);
        DataArraySource source = new DataArraySource();
        DataArrayTarget target = new DataArrayTarget();

        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                Integer data = source.readData(i);
                target.writeData(String.valueOf(data));
            }
            latch.countDown();
        }).start();

        new Thread(() -> {
            for (int i = 500; i < 1000; i++) {
                Integer data = source.readData(i);
                target.writeData(String.valueOf(data));
            }
            latch.countDown();
        }).start();

        try {
            latch.await();
        } catch (Exception e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            System.out.println(DataArraySource.getStorage());
            System.out.println(DataArrayTarget.getStorage());
        }).start();


    }

}
