package com.tuya.demo.daily.daily0805;

import java.util.Arrays;
import java.util.List;

/**
 * @author chendong
 * @date 2020/6/16 6:40 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Box<T> {
    private T t;

    public Box(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        //容器之间没有继承关系
        Box<Fruit> box0 = new Box<>(new Orange());
        Box<? extends Fruit> box1 = new Box<>(new Orange());
        //PECS原则 producer extends consumer super
        box0.setT(new Orange());
        //box1.setT(new Orange());
        Fruit t0 = box0.getT();
        Fruit t1 = box1.getT();

        List<?> res = Arrays.asList("1", "2", "3");
        List<Object> re = Arrays.asList("1", "2", "3");
        System.out.println(res);
        System.out.println(re);
    }

}
