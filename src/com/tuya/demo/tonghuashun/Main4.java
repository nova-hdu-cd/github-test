package com.tuya.demo.tonghuashun;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main4 {

    public String get(int month, int day, int hour, int minute, int second) {
        Date date = new Date(month, day, hour, minute, second);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = formatter.format(date);
        return format;
    }
}
