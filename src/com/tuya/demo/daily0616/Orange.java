package com.tuya.demo.daily0616;

/**
 * @author chendong
 * @date 2020/6/16 6:48 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Orange extends Fruit {
    private String price;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "price='" + price + '\'' +
                '}';
    }
}
