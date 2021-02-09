package com.company;

public class indexOf {
    public static void main(String[] args) {
        //实现方法 indexOf, 能够找出字符串子串存在的位置
        String str="Hello world";
        System.out.println( indexOf(str,"l"));
    }
    public static int indexOf(String str, String s) {

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if ((String.valueOf(s.charAt(0))).equals(String.valueOf(str.charAt(i)))) {
                //找到s中第一个元素在str中出现的位置
                String str1=new String(str.substring(i,(i+s.length())));
                if(str1.equals(s)){
                    return i;
                }
            }
        }
        return -1;
    }}
