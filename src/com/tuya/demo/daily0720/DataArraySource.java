package com.tuya.demo.daily0720;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author chendong
 * @date 2020/7/20 7:33 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class DataArraySource {

    private static final List<Integer> storage = new ArrayList<>();

    private static final Random r = new Random();

    static {
        for (int i = 0; i < 1000; i++) {
            storage.add(r.nextInt(100));
        }
    }

    public synchronized Integer readData(int index) {

        if (index >= storage.size()) {
            throw new RuntimeException("读取失败");
        }

        return storage.get(index);
    }

    public static List<Integer> getStorage() {
        return storage;
    }

}
