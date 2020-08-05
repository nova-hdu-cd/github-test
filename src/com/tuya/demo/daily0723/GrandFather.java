package com.tuya.demo.daily0723;

/**
 * @author chendong
 * @date 2020/7/23 9:18 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class GrandFather extends HangzhouArea {

    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "GrandFather{" +
                "area='" + area + '\'' +
                '}';
    }
}
