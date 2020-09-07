package com.tuya.demo.daily.daily0805;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author chendong
 * @date 2020/6/18 10:43 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class LocalDatetimeDemo {
    public static void main(String[] args) {
        //当前日期 年-月-日
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        //当前时间 年-月-日-时间
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
