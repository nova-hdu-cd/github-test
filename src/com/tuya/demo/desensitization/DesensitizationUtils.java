package com.tuya.demo.desensitization;

/**
 * @author chendong
 * @date 2020/7/30 8:34 下午
 * To change this template use Appearance | Editor | File and Code
 * Templates.
 */
public class DesensitizationUtils {

    public static final String MOBILE_CONNECTOR = "-";

    public static final int MOBILE_LENGTH = 11;

    public static final String MOBILE_REGEX = "(\\d{3})\\d{4}(\\d{4})";

    public static final String REPLACEMENT = "$1****$2";

    public static String mobileEncrypt(String mobile) {
        if (mobile == null && mobile.length() == 0 && mobile.length() != MOBILE_LENGTH) {
            return mobile;
        }
        return mobile.replaceAll(MOBILE_REGEX, REPLACEMENT);
    }

    public static String mobileBy86Encrypt(String mobile) {
        if (mobile == null && mobile.length() == 0 && mobile.length() != MOBILE_LENGTH) {
            return mobile;
        }
        String[] split = mobile.split(MOBILE_CONNECTOR);
        if (split.length == 1) {
            return mobileEncrypt(mobile);
        } else {
            String mobileEncrypt = mobileEncrypt(split[1]);
            return split[0] + MOBILE_CONNECTOR + mobileEncrypt;

        }
    }

    public static void main(String[] args) {
        System.out.println(DesensitizationUtils.mobileEncrypt("15639749390"));
        System.out.println(DesensitizationUtils.mobileBy86Encrypt("86-15639749390"));
    }
}
