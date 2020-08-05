package com.tuya.demo.daily0723;

/**
 * @author chendong
 * @date 2020/7/23 9:18 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Son extends Father {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                '}';
    }
}
