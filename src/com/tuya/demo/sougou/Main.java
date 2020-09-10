package com.tuya.demo.sougou;

/**
 * @author chendong
 * @date 2020/9/8 6:30 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class Main {

    public static void main(String[] args) {

        //int[] arr = {0, 2, 1, 10, 4};
//        int[] arr = {2, 3, 1, 1, 4};
//        System.out.println(min(arr));
//        System.out.println(fun(0.9, 0.001));

        System.out.println(f2("aabqcxzyw"));

    }

    public static int min(int[] arr) {
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return -1;
            }
            if (arr[i] >= arr.length - 1) {
                return 1;
            }
            if (arr[i] < arr.length - 1) {
                arr[i] = arr[arr.length - 1];
                cnt++;
                while (arr[i] > 0) {
                    arr[i]--;
                    arr[i] = arr[arr[i]--];
                    cnt++;
                }
            }
        }
        return -1;
    }

    public static double fun(double a, double b) {
//        BigDecimal aa = new BigDecimal(a);
//        BigDecimal bb = new BigDecimal(b);
//        return Double.parseDouble(aa.multiply(bb).toString());
        return a * b;
    }

    public static int f2(String str) {
        char[] chars = str.toCharArray();
        int cnt = 0;
        for (int i = 0; i + 1 < chars.length; i++) {
            if (chars[i + 1] == chars[i]) {
                continue;
            }
            for (int j = i + 1; j + 1 < chars.length; j++) {

                if (chars[j] + chars[i] == 219) {
                    cnt++;
                    if (chars[j + 1] == chars[j]) {
                        break;
                    }
                }


            }
        }
        return cnt;
    }

}
