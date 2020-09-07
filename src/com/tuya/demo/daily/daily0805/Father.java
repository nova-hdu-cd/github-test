package com.tuya.demo.daily.daily0805;

/**
 * @author chendong
 * @date 2020/7/23 9:18 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Father extends GrandFather {

    public String age;
    private String fatherName;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        return "Father{" +
                "age='" + age + '\'' +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }
}
