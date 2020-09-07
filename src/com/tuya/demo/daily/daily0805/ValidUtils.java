package com.tuya.demo.daily.daily0805;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

/**
 * @author chendong
 * @date 2020/7/23 9:17 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class ValidUtils {

    public static void valid(Object object) {
        List<Field> list;
        Class<? extends Object> curClass = object.getClass();
        while (curClass != null) {
            Field[] fields = curClass.getDeclaredFields();
            list = Arrays.asList(fields);
            for (Field field : list) {
                field.setAccessible(true);
                Object value = null;
                try {
                    value = field.get(object);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (value == null) {
                    continue;
                }
                System.out.println(field);
                System.out.println(value);
                field.setAccessible(false);
            }
            curClass = curClass.getSuperclass();
        }
    }

    public static void main(String[] args) {

        Son son = new Son();
        son.setName("chendong");
        son.setArea("hangzhou");
        son.setSouth("nanfang");
        son.setWorldId("china");

        ValidUtils.valid(son);

    }

}
