package com.tuya.demo.daily.daily0805;

/**
 * @author chendong
 * @date 2020/6/16 6:48 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Fruit {
    private String name;
    private String weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
