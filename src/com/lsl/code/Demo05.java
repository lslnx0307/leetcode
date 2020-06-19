package com.lsl.code;

import java.lang.reflect.Type;

/**
 * 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 示例 1：
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * @author shiliang.li
 * @date 2020/6/3
 */
public class Demo05 {

    public static void main(String[] args) {
//        System.out.println(replaceSpace1("We are happy."));
        System.out.println(replaceSpace1("   "));
    }

    /**
     * 第一种思路（未经思考）
     * 直接使用string的replaceall(" ", "%20"),结果打脸了，
     * @param s
     * @return
     */
    public static String replaceSpace(String s) {
        return s.replaceAll(" ", "%20");
    }

    /**
     * 第二种思路
     * 遍历字符串 遇到空格直接替换为%20
     * @param s
     * @return
     */
    public static String replaceSpace1(String s) {
        char[] replac = new char[]{'%','2','0'};
        char[] chars = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (char aChar : chars) {
            if (aChar == ' ') {
                sb.append(replac[0]);
                sb.append(replac[1]);
                sb.append(replac[2]);
            } else {
                sb.append(aChar);
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
