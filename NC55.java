//NC55 最长公共前缀
//给你一个长度为 nn 的字符串数组 strsstrs , 
//编写一个函数来查找字符串数组中的最长公共前缀，返回这个公共前缀
import java.util.*;
public class Solution {
    public String longestCommonPrefix (String[] strs) {
        // write code here
        if(strs.length == 0){
            return "";
        }
        Arrays.sort(strs);
        String st1 = strs[0];
        String st2 = strs[strs.length-1];
        int i = 0;
        String st = "";
        while(true){
            if(i == st1.length()||i == st2.length()){
                break;
            }else if(st1.charAt(i) == st2.charAt(i)){
                st = st + st1.charAt(i);
                i++;
            }else{
                break;
            }
        }
        return st;
    }
}