package com.tuya.demo.daily0723;

/**
 * @author chendong
 * @date 2020/7/23 9:18 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Father extends GrandFather {
    private String fatherName;

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        return "Father{" +
                "fatherName='" + fatherName + '\'' +
                '}';
    }
}
