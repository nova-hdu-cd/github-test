package com.tuya.demo.daily0720;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chendong
 * @date 2020/7/20 7:33 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class DataArrayTarget {

    private static List<String> storage = new ArrayList<>(1000);

    public synchronized void writeData(String item) {
        storage.add(item);
    }

    public static List<String> getStorage() {
        return storage;
    }
}
