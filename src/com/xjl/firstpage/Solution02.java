package com.xjl.firstpage;

/**
 * @描述: 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 *          例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @作者: XUJIANLIN
 */
public class Solution02 {
    /**
     * 注意，String类型字符串是不可变的，使用replace函数时，相当于重新生成了一个对象，并不会改变自身。
     * @param str
     * @return
     */
    public static String replaceSpace(StringBuffer str){
        if(str == null){
            return null;
        }
        String s = new String(str);
        String ss = s.replace(" ","%20");

        return ss;
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("We Are Happy");
        System.out.println(replaceSpace(str));
    }
}
