package com.tuya.demo.meituan;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author chendong
 * @date 2020/9/6 11:04 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> res = new HashSet<>();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            int n = Integer.parseInt(line);


            for (int i = 0; i < n; i++) {
                int s = Integer.parseInt(sc.nextLine());
                if (!res.contains(s)) {
                    Set<Integer> re = new HashSet<>(res);
                    re.remove(s);
                    res.clear();
                    res.add(s);
                    res.addAll(re);
                } else {
                    res.remove(s);
                }
            }

            for (Integer item : res) {
                System.out.println(item);
            }
        }
    }

}
