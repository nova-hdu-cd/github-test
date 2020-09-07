package com.tuya.demo.daily.daily0805;

/**
 * @author chendong
 * @date 2020/6/12 2:03 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class User {

    private String uname;
    private String uid;

    public User() {
    }

    public User(String uname, String uid) {
        this.uname = uname;
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", uid='" + uid + '\'' +
                '}';
    }
}
