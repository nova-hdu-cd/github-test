package com.tuya.demo.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 关于字符串的操作小技巧
 *
 * @author chendong
 * @date 2020/8/26 9:32 上午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class StringOperation {

    /**
     * 1.在字符串中获取不同的字符及其数量
     **/
    public static void distinctCharsWithCount(String input) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character c : input.toCharArray()) {
            Integer oldValue = map.get(c);
            Integer nValue = (oldValue == null) ? 1 : oldValue + 1;
            map.put(c, nValue);
        }
        System.out.println(map);
    }

    public static void distinctCharsWithCountV2(String input) {
        LinkedHashMap<Object, Integer> map = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        System.out.println(map);
    }

    /**
     * 2.反转字符串
     */
    public static void reverseInputString(String input) {
        StringBuilder sb = new StringBuilder(input);
        String result = sb.reverse().toString();
        System.out.println(result);
    }

    /**
     * 3.是否为回文字符串
     */
    public static void checkPalindromeString(String input) {
        boolean flag = true;
        char[] array = input.toCharArray();
        int len = array.length;
        for (int i = 0; i < len / 2; i++) {
            if (array[i] != array[len - i - 1]) {
                flag = false;
                break;
            }
        }
        System.out.println(input + " is palindrome string : " + flag);
    }

    public static void checkPalindromeStringV2(String input) {
        char[] array = input.toCharArray();
        int p1 = 0;
        int p2 = array.length - 1;
        boolean flag = true;
        while (p1 <= p2) {
            if (array[p1] != array[p2]) {
                flag = false;
                break;
            }
            p1++;
            p2--;
        }
        System.out.println(input + " is palindrome string : " + flag);
    }

    /**
     * 4.如何删除所有出现的指定字符
     */
    public static void removeCharFromString(String str, char c) {
        String result = str.replaceAll(String.valueOf(c), "");
        System.out.println(result);
    }

    /**
     * 5.如何统计字符串中的单词数
     */
    public static void countNumberOfWords(String str) {
        String trimmedLine = str.trim();
        int count = trimmedLine.isEmpty() ? 0 : trimmedLine.split("\\s+").length;
        System.out.println(count);
    }

    /**
     * 6. 如何检查两个字符串中的字符是相同
     */
    public static void checkSameCharsInString(String str1, String str2) {
        Set<Character> set1 = str1.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        Set<Character> set2 = str2.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set1.equals(set2));
    }

    public static void main(String[] args) {
        distinctCharsWithCount("hello");
        distinctCharsWithCountV2("hello");
        reverseInputString("hello");
        checkPalindromeString("heeh");
        checkPalindromeStringV2("h");
        removeCharFromString("hello", 'l');
        countNumberOfWords("my name is chendong");
        checkSameCharsInString("hello", "olleh1");
    }

}
