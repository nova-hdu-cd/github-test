package com.tuya.demo.daily0723;

/**
 * @author chendong
 * @date 2020/7/23 9:19 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class China extends World {

    private String chinaName;

    public String getChinaName() {
        return chinaName;
    }

    public void setChinaName(String chinaName) {
        this.chinaName = chinaName;
    }

    @Override
    public String toString() {
        return "China{" +
                "chinaName='" + chinaName + '\'' +
                '}';
    }
}
