//NC17 最长回文子串
//对于一个字符串，请设计一个高效算法，计算其中最长回文子串的长度。
//给定字符串A以及它的长度n，请返回最长回文子串的长度。
import java.util.*;
public class Solution {
    public int getLongestPalindrome(String A, int n) {
        // write code here
        char[] a = A.toCharArray();
        int res = 0;
        for(int i = 0; i < a.length; i++){
            int b1 = soild(a,i,i);
            int b2 = soild(a,i,i+1);
            res = res > b1 ? res : b1;
            res = res > b2 ? res : b2;
        }
        return res;
        
    }
    
    int soild(char[] a ,int i, int j){
        while(i >= 0 && j < a.length && a[i] == a[j]){
            i--;
            j++;
        }
        return j-i-1;
    }
}