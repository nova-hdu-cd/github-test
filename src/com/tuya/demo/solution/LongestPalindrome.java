package com.tuya.demo.solution;

/**
 * @author chendong
 * @date 2020/9/14 9:53 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class LongestPalindrome {

    public boolean isPalindrome(String str, int i, int j) {
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String longestPalindrome(String str) {
        if (str.length() < 2) {
            return str;
        }

        int curlen = 1;
        int start = 0;
        String s = str.substring(0, 1);
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (j - i + 1 > curlen && isPalindrome(str, i, j)) {
                    curlen = j - i + 1;
                    start = i;
                }
            }
        }

        return s.substring(start, start + curlen);

    }

}
