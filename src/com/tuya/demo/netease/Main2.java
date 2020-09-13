package com.tuya.demo.netease;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author chendong
 * @date 2020/9/11 6:15 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] line = scanner.nextLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int m = Integer.parseInt(line[1]);
            System.out.println(m - n);
            System.out.println(m - n);
            System.out.println(n + " " + m);
            HashMap<Object, Object> map = new HashMap<>();
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();

            }
            ;
        }
    }


}
