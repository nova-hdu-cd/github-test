package com.tuya.demo.netease;

import java.util.Scanner;

class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //int n=Integer.valueOf(sc.nextLine());
            String str = sc.nextLine();
            String tmp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            int len = str.length();
            int i = 0;
            int j = 0;
            StringBuilder sb = new StringBuilder();
            while (i < len && j < len) {
                int cnt = 0;
                while (j < len && str.charAt(i) == str.charAt(j)) {
                    j++;
                    cnt++;
                }
                if (cnt <= 3) {
                    for (int m = 0; m < cnt; m++) {
                        sb.append(str.charAt(i++));
                    }
                } else if (cnt > 3) {
                    while (cnt > 3) {
                        sb.append("0" + tmp.charAt(cnt - 4) + str.charAt(i));
                        cnt -= 52;
                    }
                    if (cnt <= 3) {
                        for (int k = 0; k < cnt; k++) {
                            sb.append(str.charAt(i));
                        }
                    }
                    i = j;
                }
            }
            System.out.println(sb.toString());
        }
    }
}