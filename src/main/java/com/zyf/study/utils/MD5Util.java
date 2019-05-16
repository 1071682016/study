package com.zyf.study.utils;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created with IntelliJ IDEA.
 * User: 012
 * Date: 2019/5/16
 * Time: 15:46
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class MD5Util {

    private static final String key = "";

    /**
     * @param text 明文密码
     * @param key  密钥
     * @return 加密过的字符串
     */
    public static String md5(String text, String key) {
        //加密后的字符串
        String encodeStr = DigestUtils.md5Hex(text + key);
        return encodeStr;

    }

    /**
     * 验证
     *
     * @param text 明文密码
     * @param key  密钥
     * @param md5  密文
     * @return true/false
     */
    public static boolean verify(String text, String key, String md5) throws Exception {
        //根据传入的密钥进行验证
        String md5Text = md5(text, key);
        if (md5Text.equalsIgnoreCase(md5)) {
            return true;
        }
        return false;

    }

    public static void main(String[] org) throws Exception {
        verify("123456", "124abc", "c6e501ed3fc1b6c9349e483a89d92765");
    }
}
